package lab3;

import org.junit.Test;

import static org.junit.Assert.*;

public class FundTradeTest {

    @Test
    public void testDividend(){

        FundTrade fundTrade = new FundTrade(2, "APPL", 4, 100.00);
        assertEquals("", fundTrade.getDividend(), 10.00, 0);

    }
}