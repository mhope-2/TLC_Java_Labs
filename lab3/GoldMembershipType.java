package lab3;

public class GoldMembershipType extends MembershipType{

    private final String membershipType = "Gold";

    public GoldMembershipType(int points) {
    }

    public String getMembershipType() {
        return membershipType;
    }
}
