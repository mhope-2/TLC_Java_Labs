package lab3;

public class Account {

    private double tradeValue = 0;

    public double getTradeValue() {
        return tradeValue;
    }

    public void setTradeValue(double tradeValue) {
        this.tradeValue += tradeValue;
    }
}
