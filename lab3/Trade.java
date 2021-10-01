package lab3;

public class Trade {
    private int id;
    private String symbol;
    private int quantity;
    private double price;

    public Trade(int id, String symbol, int quantity, double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public Trade(int id, String symbol, int quantity) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price < 0)
            throw new IllegalArgumentException("Invalid Price Vale: Only positive prices are accepted");
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id=" + id +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
