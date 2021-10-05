package lab3;

import org.junit.Test;

import static org.junit.Assert.*;

public class FundTradeTest {

    @Test
    public void testDividend() throws TradeIDException {

        FundTrade fundTrade = new FundTrade(2, "APPL", 4, 100.00);
        assertEquals("", fundTrade.getDividend(), 20.00, 0);

    }
}
