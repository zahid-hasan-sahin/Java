package RestaurantManagement;

public class Product {

    private int productId;
    private String name;
    private double price;

    public Product() {
        productId = 0;
        name = "No name yet";
        price = 0.0;
    }

    public Product(int productCode, String name, double price) {
        this.productId = productCode;
        this.name = name;
        this.price = price;
    }

    public void setProductId(int productCode) {
        this.productId = productCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
