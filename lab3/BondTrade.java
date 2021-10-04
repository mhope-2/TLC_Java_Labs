package lab3;

public class BondTrade extends Trade{

    private double dividend;

    public BondTrade(int id, String symbol, int quantity, double price, double dividend) {
        super(id, symbol, quantity, price);
        this.dividend = dividend;
    }

    public BondTrade(int id, String symbol, int quantity, double dividend) {
        super(id, symbol, quantity);
        this.dividend = dividend;
    }

    public double getDividend() {
        return dividend;
    }
}
