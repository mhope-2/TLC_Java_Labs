package lab3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Trade tradeObject1 = new Trade(3, "APPL", 7, 9.00);
        Trade tradeObject2 = new Trade(3, "APPL", 7, 100.00);
        Trade tradeObject3 = new Trade(3, "APPL", 7, 100.00);

        Trade tradeArray[] = {tradeObject1, tradeObject2, tradeObject3};

        Account account = new Account();
        account.setTradeObjects(tradeArray);

        // loop through trade array and print each in turn
        for (Trade tradeObject : tradeArray){
            System.out.println(tradeObject);
        }

        // print trade items with price less than 10.00
        for (Trade tradeObject : tradeArray){
            if (tradeObject.getPrice() < 10.00){
                System.out.println(tradeObject);
            }
        }
    }
}
