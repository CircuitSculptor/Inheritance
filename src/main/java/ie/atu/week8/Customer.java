package ie.atu.week8;

public class Customer extends Person {

    private String customerNum;
    private boolean onMailingList;

    public Customer() {
        super();    // Calls parent constructor
    }

    public Customer(String name, String address, String phone, String customerNum, boolean onMailingList) {
        super(name, address, phone);    // sends it to the person class
        this.customerNum = customerNum;
        this.onMailingList = onMailingList;
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

    @Override
    public String toString() {
        return  "Customer Details: " + super.toString() + " " +
                ", customerNum='" + customerNum + '\'' +
                ", onMailingList=" + onMailingList;
    }
}
