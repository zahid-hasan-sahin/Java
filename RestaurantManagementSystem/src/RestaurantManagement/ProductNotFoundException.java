package RestaurantManagement;

public class ProductNotFoundException extends Exception {

    ProductNotFoundException(String s) {
        super(s);
    }

    ProductNotFoundException() {
        super("Product not found");
    }
}
