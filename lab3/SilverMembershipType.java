package lab3;

public class SilverMembershipType extends MembershipType{

    private static final String membershipType = "Silver";
    private static final int maxTradePerDay = 5;

    public SilverMembershipType() {

    }

    public String getMembershipType() {
        return membershipType;
    }


}
