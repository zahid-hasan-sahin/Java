package finalexam;

import java.util.Scanner;

public class GroceriesApp {

    public static void dispMenu() {
        System.out.println("========== Menu ==========");
        System.out.println("[1] Add Customer");
        System.out.println("[2] Buy Fruit");
        System.out.println("[3] Buy Canned Food");
        System.out.println("[4] Display Grocery Shopping List");
        System.out.println("[5] Exit");
        System.out.println("==========================");
        System.out.print("\nSelect task: ");
    }

    public static void main(String[] args) {
        Customer customer = null;
        Scanner scan = new Scanner(System.in);
        while (true) {
            dispMenu();
            int in = scan.nextInt();

            try {
                if (in == 1) {
                    scan.nextLine();
                    System.out.print("<<< Add Customer >>>\n"
                            + "Name: ");

                    String name = scan.nextLine();
                    customer = new Customer(name);
                } else if (in == 2) {
                    if (customer == null) {
                        System.out.println("There is no customer.Please start by entering the customer's name.");
                    } else {
                        scan.nextLine();
                        System.out.println("<<< Buy Fruit >>>");
                        System.out.print("Description:");
                        String Description = scan.nextLine();
                        System.out.print("Price (in USD):");
                        double price = scan.nextDouble();
                        System.out.print("Weight (in pound):");
                        double weight = scan.nextDouble();
                        Groceries fruit = new Fruit(Description, price, weight);
                        customer.buy(fruit);
                    }
                } else if (in == 3) {
                    if (customer == null) {
                        System.out.println("There is no customer.Please start by entering the customer's name.");
                    } else {
                        scan.nextLine();
                        System.out.println("<<< Buy Canned Food >>>");
                        System.out.print("Description:");
                        String Description = scan.nextLine();
                        System.out.print("Price (in USD):");
                        double price = scan.nextDouble();
                        System.out.print("Type:");
                        String type = scan.next();
                        System.out.print("Expiry Date:");
                        String expiredDate = scan.next();
                        Groceries cannedFood = new CannedFood(Description, price, expiredDate, type);
                        customer.buy(cannedFood);
                    }
                } else if (in == 4) {
                    if (customer == null) {
                        System.out.println("There is no customer.Please start by entering the customer's name.");
                    } else if (customer.calcItemPurchased() == 0) {
                        System.out.println("No items were purchased!!");
                    } else {
                        System.out.println(customer.toString());
                        customer.print();
                    }
                } else if (in == 5) {
                    System.out.println("Thank you! :)");
                    break;
                } else {
                    throw new Exception(" Invalid Input!!");
                }
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }

}
