package finalexam;

import java.text.DecimalFormat;

public class Fruit extends Groceries {

    private double weight;

    Fruit(String description, double price, double weight) {
        super(description, price);
        this.weight = weight;
    }

    public double calcWeightInGram() {
        return (weight * poundToGram);
    }

    @Override
    String displayInfo() {
        DecimalFormat df = new DecimalFormat("#.##");
        String res = "Grocery description:" + getDescription() + "\n"
                + "Weight in pound: " + weight + "\n"
                + "Weight in gram: " + calcWeightInGram() + "\n"
                + "Price: USD " + df.format(getPrice()) + "\n"
                + "Price converted to Malaysian: MYR" + df.format(getPrice() * USDToMyR) + "\n";
        return res;
    }
}
