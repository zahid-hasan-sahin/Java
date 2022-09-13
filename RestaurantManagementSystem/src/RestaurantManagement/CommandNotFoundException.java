package RestaurantManagement;

public class CommandNotFoundException extends Exception {

    CommandNotFoundException(String s) {
        super(s);
    }

    CommandNotFoundException() {
        super("Command not found");
    }
}
