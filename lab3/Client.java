package lab3;

import java.time.LocalTime;

public class Client {
    private String firstName;
    private String lastName;
    private int points = 0;
    private MembershipType membershipType;
    private Trade trade;
    private double maxTradeAmountPerDay;
    LocalTime tradeTime;


    public Client(String firstName, String lastName, MembershipType membershipType, int points) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = 0;
    }

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Client creating trade and increasing points
    public void createTrade(int id, String symbol, int quantity, double price){
        trade = new Trade(id, symbol, quantity, price);

        // add client point for trade
        this.points += 1;
    }

    // canTrade method
    public boolean canTrade(){
        this.setMembershipType(this.getPoints());

        if (this.getMembershipType().toString().equals("Bronze")){

            int compare = LocalTime.now().compareTo(LocalTime.parse("10:00:00"));

            if (this.points > 5 || compare < 0){
                return false;
            }else{
                return true;
            }
        } else if (this.getMembershipType().toString().equals("Silver")){
            if (points >  10){
                return false;
            }else{
                return true;
            }
        }else if(this.getMembershipType().toString().equals("Gold")){
            if (this.points > 20){
                return false;
            }else {
                return true;
            }
        }

        return false;
    }

    // addTrade method
    public void addTrade(Trade trade){

    }


    public double getMaxTradeAmountPerDay() {
        return maxTradeAmountPerDay;
    }

    public void setMaxTradeAmountPerDay(double maxTradeAmountPerDay) {
        this.maxTradeAmountPerDay = maxTradeAmountPerDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // set client membership type
    public void setMembershipType(int points) {
        if (this.points < 10){
            this.membershipType.setMembershipType("Bronze");
        } else if (this.points >= 10 && this.points <= 19){
            this.membershipType.setMembershipType("Silver");
        } else{
            this.membershipType.setMembershipType("Gold");
        }
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
