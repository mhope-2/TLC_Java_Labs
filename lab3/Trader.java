package lab3;

public class Trader {
    private String name;
    private Account account;
    private Trade trade;


    public Trader(String name) {
        this.name = name;
    }

    public double addTrade(){
        account = new Account();
        trade = new Trade(2, "APPL", 8, 200.00);

        double tradeValue = 0.00;
        tradeValue  += (trade.getPrice() * trade.getQuantity());
        account.setTradeValue(tradeValue);

        return account.getTradeValue();
    }
}
