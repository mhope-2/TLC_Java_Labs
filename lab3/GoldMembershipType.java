package lab3;

public class GoldMembershipType extends MembershipType{

    private final String membershipType = "Gold";
    private static final int maxTradePerDay = 20;

    public GoldMembershipType(int points) {
    }

    public String getMembershipType() {
        return membershipType;
    }
}
