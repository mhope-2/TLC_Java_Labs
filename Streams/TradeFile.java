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

    public TradeFile(String symbol, String date, String timeStamp, String quantity, String price) {
        // parse price as BigDecimal
        BigDecimal priceObj = new BigDecimal(price);

        // Format Date
        String year, month, day;
        year = date.substring(0, 4);
        month = date.substring(4, 6);
        day = date.substring(6, 8);

        this.symbol = symbol;
        this.date = LocalDate.parse(date);
        this.timeStamp = LocalTime.ofNanoOfDay(Long.parseLong(timeStamp));
        this.quantity =  Integer.parseInt(quantity);
        this.price = priceObj ;
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
