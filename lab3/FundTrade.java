package lab3;

public class FundTrade extends Trade{

    private double dividend;

    private final double percentage = 20.00;

    public FundTrade(int id, String symbol, int quantity, double price, double dividend) throws TradeIDException {
        super(id, symbol, quantity, price);
        this.dividend = (percentage/100) * price;
    }

    public FundTrade(int id, String symbol, int quantity, double price) throws TradeIDException {
        super(id, symbol, quantity, price);
        this.dividend = (percentage/100) * price;
    }

    public FundTrade(int id, String symbol, int quantity) {
        super(id, symbol, quantity);
    }

    public void calcDividend(){
        this.dividend = (percentage/100) * super.getPrice();
    }

    public double getDividend() {
        return dividend;
    }

}
