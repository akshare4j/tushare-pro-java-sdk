package com.github.tusharepro.core.http;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.github.tusharepro.core.TusharePro;
import com.github.tusharepro.core.bean.BaseBean;
import com.github.tusharepro.core.util.TypeUtil;
import com.github.tusharepro.core.util.Util;

public class Client {
  private static final Logger logger = LoggerFactory.getLogger(Client.class);
  private static final ObjectMapper objectMapper =
      JsonMapper.builder().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).build();

  private static <T extends BaseBean> Response post(Request<T> requestJson) throws IOException {
    final TusharePro tusharePro = requestJson.tusharePro;
    final ExecutorService requestExecutor = tusharePro.requestExecutor;
    final Function<byte[], byte[]> httpFunction = tusharePro.httpFunction;

    try {
      final Future<Response> responseFuture = requestExecutor.submit(() -> {
        logger.info("request: " + objectMapper.writeValueAsString(requestJson));
        String response = new String(httpFunction.apply(objectMapper.writeValueAsBytes(requestJson)));
        logger.info("response: " + response);
        return objectMapper.readValue(response, new TypeReference<Response>() {});
      });

      return responseFuture.get();
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }
    throw new IOException();
  }

  public static <T extends BaseBean> List<T> beanList(Request<T> request) throws IOException {
    final TusharePro tusharePro = request.tusharePro;
    final int maxRetries = tusharePro.maxRetries;
    final TimeUnit timeUnit = tusharePro.retrySleepTimeUnit;
    final long timeOut = tusharePro.retrySleepTimeOut;
    // final Double integral = tusharePro.integral;

    Class beanClass;
    try {
      beanClass = TypeUtil.getActualTypeArgumentClass(request.getClass());
    } catch (ClassNotFoundException e) {
      throw new IOException();
    }

    for (int current = 0; current <= maxRetries; current++) {
      try {
        return f(request, beanClass);
      } catch (Exception e) {
        logger.error("", e);
        if (timeUnit != null && timeOut != 0) {
          try {
            timeUnit.sleep(timeOut);
          } catch (InterruptedException e1) {
            e1.printStackTrace();
          }
        }
      }
    }

    throw new IOException();
  }

  private static <T extends BaseBean> List<T> f(Request<T> request, Class<?> beanClass) throws IOException {
    return Optional.ofNullable(Client.post(request)).map(response -> {
      List<String> fields = response.getData().getFields().stream().map(Util::camelName).collect(Collectors.toList());
      List<List<?>> items = response.getData().getItems();

      List<T> beanList = new ArrayList<>(items.size());

      try {
        for (int i = 0; i < items.size(); i++) {

          T bean = (T) beanClass.getDeclaredConstructor().newInstance();

          List<?> item = items.get(i);
          Class<?> c = bean.getClass();
          Map<String, Field> fieldMap = new HashMap<>();
          while (c != null) {
            fieldMap.putAll(Arrays.stream(c.getDeclaredFields()).collect(Collectors.toMap(Field::getName, x -> x)));
            c = c.getSuperclass();
          }

          for (int j = 0; j < fields.size(); j++) {
            Field field = fieldMap.get(fields.get(j));
            field.setAccessible(true);

            // 对时间进行特殊处理
            Object value = item.get(j);
            // System.out.println(value == null ? null : value.getClass());
            switch (field.getType().getTypeName()) {
              case "java.time.LocalDate":
                value = value == null ? null : LocalDate.parse((String) value, DateTimeFormatter.BASIC_ISO_DATE);
                break;
            }

            field.set(bean, value);
          }
          beanList.add(bean);
        }
      } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
        logger.error("Error creating bean instance", e);
        throw new RuntimeException();
      }

      return beanList;
    }).orElse(Collections.emptyList());
  }

}
