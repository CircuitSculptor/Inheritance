package ie.atu.week8;

public class Customer extends Person {

    private String customerNum;
    private boolean onMailingList;

    private int LoyaltyPoints;

    public Customer() {
        super();    // Calls parent constructor
    }

    public Customer(String name, String address, String phone, String customerNum, boolean onMailingList, int LoyaltyPoints) {
        super(name, address, phone);    // sends it to the person class
        this.customerNum = customerNum;
        this.onMailingList = onMailingList;
        this.LoyaltyPoints = LoyaltyPoints;
    }

    public String getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(String customerNum) {
        this.customerNum = customerNum;
    }

    public boolean isOnMailingList() {
        return onMailingList;
    }

    public void setOnMailingList(boolean onMailingList) {
        this.onMailingList = onMailingList;
    }

    public int getLoyaltyPoints() { return LoyaltyPoints; }

    public void setLoyaltyPoints(int LoyaltyPoints) { this.LoyaltyPoints = LoyaltyPoints;}

    @Override
    public String toString() {
        return  "Customer Details: " + super.toString() + " " +
                ", customerNum='" + customerNum + '\'' +
                ", onMailingList=" + onMailingList + '\'' +
                ", loyaltyPoints=" + LoyaltyPoints;
    }
}
