package finalexam;

public abstract class Groceries implements Convertible {

    private String description;
    private double price;

    public Groceries() {

    }

    public Groceries(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {

   
        return price;
    }

    public double calcPriceInMYR() {
        return price * USDToMyR;
    }

    abstract String displayInfo();
}
