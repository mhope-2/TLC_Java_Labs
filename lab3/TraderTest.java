package lab3;

import org.junit.Test;
import static org.junit.Assert.*;

public class TraderTest {

    @Test
    public void testTradeCount(){

        Trader trader = new Trader("Kay");

        assertEquals("", trader.addTrade(), 1600.00, 0);
    }

}
