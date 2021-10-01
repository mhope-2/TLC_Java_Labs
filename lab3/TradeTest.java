package lab3;

import org.junit.Test;

import static org.junit.Assert.*;


public class TradeTest {

    @Test
    public void createTrade(){

        Trade t1 = new Trade(1, "IBM", 14, 400.00);

        assertEquals(t1.getId(), 1);

    }
}
