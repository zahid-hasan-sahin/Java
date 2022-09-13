package finalexam;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Customer {

    private String name;
    private double totalPrice;
    ArrayList<Groceries> groceriesList;

    Customer(String name) {
        this.name = name;
        totalPrice = 0.0;
        groceriesList = new ArrayList<Groceries>();
    }

    @Override
    public String toString() {
        return "<<<" + name + "'s grocery shopping list >>>";
    }

    public int calcItemPurchased() {
        return groceriesList.size();
    }

    public void buy(Groceries item) {
        groceriesList.add(item);
        totalPrice += item.getPrice();
    }

    public void print() {
        System.out.println("Number of items purchased: " + calcItemPurchased());
        double total = 0;
        int c = 1;
        DecimalFormat df = new DecimalFormat("#.##");

        for (Groceries item : groceriesList) {
            System.out.println("Item " + c++);
            System.out.print(item.displayInfo());
            total += item.calcPriceInMYR();
        }
        System.out.println("TOTAL PRICE: MYR " + df.format(total));
    }
}
