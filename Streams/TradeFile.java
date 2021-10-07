package Streams;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class TradeFile {
    private String symbol;
    private LocalDate date;
    private LocalTime timeStamp;
    private int quantity;
    private BigDecimal price;

    public TradeFile(String symbol, LocalDate date, LocalTime timeStamp, int quantity, BigDecimal price) {
        this.symbol = symbol;
        this.date = date;
        this.timeStamp = timeStamp;
        this.quantity = quantity;
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
