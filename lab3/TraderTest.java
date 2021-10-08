package lab3;

import org.junit.Test;
import static org.junit.Assert.*;

public class TraderTest {
//    public static void main(String[] args) {
//        IntArr intArr = new IntArr();
//
//        for (int i = 0; i<5; i++){
//            System.out.println(intArr.getIntArr()[i]);
//        }
//    }
//
    @Test
    public void testTradeCount() throws TradeIDException {

        Trader trader = new Trader("Kay");

        assertEquals("", trader.addTrade(), 1600.00, 0);
    }

}
