package RestaurantManagement;

import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Console {

    static void commandMenu() {
        System.out.println("COMMAND MENU\n"
                + "list   -List all products\n"
                + "add    -add a product\n"
                + "rem    -remove a  product\n"
                + "help   -show this menu\n"
                + "exit   -Exit this application");
    }

    static String inputCommand() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a command: ");
        return scan.next();
    }

    static Product inputProduct() {
        Scanner scan = new Scanner(System.in);
        Product pro = new Product();
        System.out.print("Enter Product id: ");
        pro.setProductId(scan.nextInt());
        System.out.print("Enter Product Name: ");
        pro.setName(scan.next());
        System.out.print("Enter product price: ");
        pro.setPrice(scan.nextDouble());
        return pro;
    }

    static void excuteCommand(String s) throws CommandNotFoundException {
        ProductDetails.refresh();
        if (s.equalsIgnoreCase("list")) {
            List<Product> list = ProductDetails.getListOfProducts();
            printList(list);
            System.out.println("============================\n\n");
        } else if (s.equalsIgnoreCase("add")) {
            Product p = inputProduct();
            boolean isAdded = ProductDetails.addProduct(p);
            if (isAdded) {
                System.out.println("|| Added! ||");
            }
            System.out.println("============================\n\n");
        } else if (s.equalsIgnoreCase("rem")) {
            Scanner scan = new Scanner(System.in);
            List<Product> list = ProductDetails.getListOfProducts();
            printList(list);
            System.out.print("Enter Product Id: ");
            int id = scan.nextInt();
            try {
                ProductDetails.removeProduct(id);
                System.out.println("|| Removed! ||");
            } catch (ProductNotFoundException e) {
                System.out.println("||-Product not found-||");
            }
            System.out.println("============================\n\n");
        } else if (s.equalsIgnoreCase("help")) {
            System.out.println("||Help||");
        } else {
            throw new CommandNotFoundException();
        }
    }

    static void printList(List<Product> list) {
        if (list.size() == 0) {
            System.out.println("||-No Product Found-||");
            return;
        }
        System.out.println("||PRODUCT LIST||");
        for (int i = 0; i < list.size(); i++) {
            Product curr = list.get(i);

            System.out.println(curr.getProductId() + "    " + curr.getName() + "    "
                    + NumberFormat.getCurrencyInstance().format(curr.getPrice()));
        }
    }
}
