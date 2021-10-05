package lab3;

import org.junit.Test;

import static org.junit.Assert.*;

public class BondTradeTest {

    @Test
    public void testDividend() throws TradeIDException {
        BondTrade bondTrade = new BondTrade(3, "APPL", 90, 23.45, 12.12);

        assertEquals("", bondTrade.getDividend(), 12.12,0);
    }

}
