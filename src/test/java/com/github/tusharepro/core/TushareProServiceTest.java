/**
 * 
 */
package com.github.tusharepro.core;

import static org.junit.jupiter.api.Assertions.fail;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import com.github.tusharepro.core.bean.Daily;
import com.github.tusharepro.core.http.Request;

/**
 * @author leeyazhou
 */
class TushareProServiceTest {

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#stockBasic(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testStockBasic() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#tradeCal(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testTradeCal() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#namechange(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testNamechange() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#hsConst(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testHsConst() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#stockCompany(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testStockCompany() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#stkManagers(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testStkManagers() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#stkRewards(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testStkRewards() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#newShare(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testNewShare() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#daily(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testDaily() {
    TusharePro.setGlobal(new TusharePro.Builder().setToken("xxx").build());
    try {
      TushareProService.daily(new Request<Daily>() {}.allFields() // 所有字段
          .param(Daily.Params.ts_code.value("601360")) // 参数
          .param(Daily.Params.trade_date.value("20250605")) // 参数
          .param(Daily.Params.start_date.value("20240605")) // 参数
          .param(Daily.Params.end_date.value("20250605")) // 参数
      );
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#weekly(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testWeekly() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#monthly(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testMonthly() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#adjFactor(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testAdjFactor() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#suspend(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testSuspend() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#suspendD(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testSuspendD() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#dailyBasic(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testDailyBasic() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#moneyflow(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testMoneyflow() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#stkLimit(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testStkLimit() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#limitList(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testLimitList() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#moneyflowHsgt(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testMoneyflowHsgt() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#hsgtTop10(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testHsgtTop10() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#hkHold(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testHkHold() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#ggtDaily(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testGgtDaily() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#ggtMonthly(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testGgtMonthly() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#income(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testIncome() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#balancesheet(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testBalancesheet() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#cashflow(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testCashflow() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#forecast(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testForecast() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#express(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testExpress() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#dividend(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testDividend() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#finaIndicator(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testFinaIndicator() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#finaAudit(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testFinaAudit() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#finaMainbz(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testFinaMainbz() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#disclosureDate(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testDisclosureDate() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#ggtTop10(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testGgtTop10() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#margin(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testMargin() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#marginDetail(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testMarginDetail() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#top10Holders(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testTop10Holders() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#top10Floatholders(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testTop10Floatholders() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#topList(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testTopList() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#topInst(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testTopInst() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#pledgeStat(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testPledgeStat() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#pledgeDetail(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testPledgeDetail() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#repurchase(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testRepurchase() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#concept(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testConcept() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#conceptDetail(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testConceptDetail() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#shareFloat(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testShareFloat() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#blockTrade(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testBlockTrade() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#stkAccount(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testStkAccount() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#stkAccountOld(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testStkAccountOld() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#stkHoldernumber(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testStkHoldernumber() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#stkHoldertrade(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testStkHoldertrade() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#indexBasic(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testIndexBasic() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#indexDaily(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testIndexDaily() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#indexWeekly(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testIndexWeekly() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#indexMonthly(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testIndexMonthly() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#indexWeigth(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testIndexWeigth() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#indexDailybasic(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testIndexDailybasic() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#indexClassify(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testIndexClassify() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#indexMember(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testIndexMember() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#dailyInfo(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testDailyInfo() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#indexGlobal(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testIndexGlobal() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#fundBasic(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testFundBasic() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#fundCompany(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testFundCompany() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#fundManager(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testFundManager() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#fundShare(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testFundShare() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#fundNav(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testFundNav() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#fundDiv(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testFundDiv() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#fundPortfolio(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testFundPortfolio() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#fundDaily(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testFundDaily() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#fundAdj(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testFundAdj() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#futBasic(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testFutBasic() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#futDaily(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testFutDaily() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#futHolding(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testFutHolding() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#futWsr(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testFutWsr() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#futSettle(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testFutSettle() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#futMapping(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testFutMapping() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#futWeeklyDetail(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testFutWeeklyDetail() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#optBasic(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testOptBasic() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#optDaily(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testOptDaily() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#ftTick(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testFtTick() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#cbBasic(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testCbBasic() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#cbIssue(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testCbIssue() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#cbDaily(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testCbDaily() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#ycCb(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testYcCb() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#cbPriceChg(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testCbPriceChg() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#ecoCal(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testEcoCal() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#fxObasic(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testFxObasic() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#fxDaily(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testFxDaily() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#hkBasic(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testHkBasic() {
    fail("Not yet implemented");
  }

  /**
   * Test method for
   * {@link com.github.tusharepro.core.TushareProService#hkDaily(com.github.tusharepro.core.http.Request)}.
   */
  @Test
  void testHkDaily() {
    fail("Not yet implemented");
  }

}
