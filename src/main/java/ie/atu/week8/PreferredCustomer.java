package ie.atu.week8;

public class PreferredCustomer extends Customer {
    public static void main(String[] args) {

        //private String loyaltyPoints;

        PreferredCustomer preferredCustomer = new PreferredCustomer();
        preferredCustomer.setName("Bartek");
        preferredCustomer.setAddress("ATU");
        preferredCustomer.setPhone("091 12345");
        preferredCustomer.setCustomerNum("1002");
        preferredCustomer.setOnMailingList(false);
        //preferredCustomer.addLoyaltyPoints(700);

        System.out.println(preferredCustomer);

    }
}
