package BankOfMallon;

public class Account {
    private final Double interest;
    private Double fee;
    private Double overdraft_facility;

    public Account(Double interest, Double fee, Double overdraft_facility) {
        this.interest = interest;
        this.fee = fee;
        this.overdraft_facility = overdraft_facility;
    }



}
