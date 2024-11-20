package src.main.java.ie.atu.week8;


public class Customer extends Person {
    private int customerNumber;
    private boolean onMailingList;

    public Customer() {
        super();
        this.customerNumber = 0;
        this.onMailingList = false;
    }

    public Customer(String name, String address, String phone, int customerNumber, boolean onMailingList) {
        super(name, address, phone);
        this.customerNumber = customerNumber;
        this.onMailingList = onMailingList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", onMailingList=" + onMailingList +
                '}';
    }
}