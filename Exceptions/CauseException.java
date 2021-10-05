package Exceptions;

public class CauseException {
    private double dividend;

    public CauseException(double dividend) {
        this.dividend = dividend;
    }

    public double getDividend() {
        return dividend;
    }

    public void setDividend(double dividend) {
        this.dividend = dividend;
    }

    public double divide(double divisor) {
        return this.dividend / divisor;
    }
}
