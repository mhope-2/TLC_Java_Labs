package lab3;

public class Client {
    private String firstName;
    private String lastName;
    private static int points = 0;
    private MembershipType membershipType;
    private Trade trade;


    public Client(String firstName, String lastName, MembershipType membershipType, int points) {
        this.firstName = firstName;
        this.lastName = lastName;
        Client.points = 0;
        this.membershipType = new MembershipType();
    }

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Client creating trade and increasing points
    public void createTrade(int id, String symbol, int quantity, double price){
        trade = new Trade(id, symbol, quantity, price);
        Client.points += 1;
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
