package ie.atu.week8;

public class CustomerApp {

    public static void main(String[] args) {
        Customer newC = new Customer("Bartek", "ATU", "12345678", "1234", false);
        System.out.println(newC.toString());
    }
}
