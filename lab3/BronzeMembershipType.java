package lab3;

public class BronzeMembershipType extends MembershipType{

    private String membershipType = "Bronze";
    private static final int maxTradePerDay = 5;

    public BronzeMembershipType() {

    }

    public String getMembershipType() {
        return membershipType;
    }
}
