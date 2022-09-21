package BankOfMallon;

public class FixedTermSavingsAccount extends Account{

    private Double interest_rate;


    public FixedTermSavingsAccount(Double interest, Double fee, Double overdraft_facility) {
        super(interest, fee, overdraft_facility);
    }
}
