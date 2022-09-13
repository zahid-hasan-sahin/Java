package MidTerm;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> ar = new ArrayList<Customer>();
        ar.add(new Customer(1, "A"));
        ar.add(new Customer(2, "B"));
        ar.add(new Customer(3, "C"));
        ar.add(new Customer(4, "D"));
        ar.add(new Customer(5, "E"));
        ar.add(new Customer(6, "F"));
        ar.add(new Customer(7, "G"));
        ar.add(new Customer(8, "H"));
        ar.add(new Customer(9, "I"));
        ar.add(new Customer(10, "J"));
        ar.add(new Customer(11, "K"));
        Teller ob = new Teller(1, "01-01-2001", "");
        for (int i = 0; i < ar.size(); i++) {
            ob.addcustomer(ar.get(i));
        }
        System.out.println(ob.customerInfo);

    }
}
