package Assignment;

import java.util.Scanner;

/**
 * Class for the purchase of one kind of item, such as 3 oranges. Prices are set
 * supermarket style, such as 5 for $1.25.
 */
public class project_5_4 {

    private String name;
    private int groupCount; //Part of a price, like the 2 in
//2 for $1.99.
    private double groupPrice; //Part of a price, like the $1.99
    // in 2 for $1.99.
    private int numberBought; //Number of items bought.

    public void setName(String newName) {
        name = newName;
    }

    /**
     * Sets price to count pieces for $costForCount. For example, 2 for $1.99.
     */
    public void setPrice(int count, double costForCount) {
        if ((count <= 0) || (costForCount <= 0)) {
            System.out.println("Error: Bad parameter in "
                    + "setPrice.");
            System.exit(0);
        } else {
            groupCount = count;
            groupPrice = costForCount;
        }
    }

    public void setNumberBought(int number) {
        if (number <= 0) {
            System.out.println("Error: Bad parameter in "
                    + "setNumberBought.");
            System.exit(0);
        } else {
            numberBought = number;
        }
    }

    /**
     * Reads from keyboard the price and number of a purchase.
     */
    public void readInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter name of item you are purchasing:");
        name = keyboard.nextLine();
        System.out.println("Enter price of item as two numbers.");
        System.out.println("For example, 3 for $2.99 is entered as");
        System.out.println("3 2.99");
        System.out.println("Enter price of item as two numbers, "
                + "now:");
        groupCount = keyboard.nextInt();
        groupPrice = keyboard.nextDouble();
        while ((groupCount <= 0) || (groupPrice <= 0)) { //Try again:
            System.out.println("Both numbers must "
                    + "be positive. Try again.");
            System.out.println("Enter price of "
                    + "item as two numbers.");
            System.out.println("For example, 3 for "
                    + "$2.99 is entered as");
            System.out.println("3 2.99");
            System.out.println(
                    "Enter price of item as two numbers, now:");
            groupCount = keyboard.nextInt();
            groupPrice = keyboard.nextDouble();
        }
        System.out.println("Enter number of items purchased:");
        numberBought = keyboard.nextInt();
        while (numberBought <= 0) { //Try again:
            System.out.println("Number must be positive. "
                    + "Try again.");
            System.out.println("Enter number of items purchased:");
            numberBought = keyboard.nextInt();
        }
    }

    /**
     * Displays price and number being purchased.
     */
    public void writeOutput() {
        System.out.println(numberBought + " " + name);
        System.out.println("at " + groupCount
                + " for $" + groupPrice);
    }

    public String getName() {
        return name;
    }

    public double getTotalCost() {
        return (groupPrice / groupCount) * numberBought;
    }

    public double getUnitCost() {
        return groupPrice / groupCount;
    }

    public int getNumberBought() {
        return numberBought;
    }
}

class Tester5 {

    public static void main(String[] args) {

        project_5_4 Oranges = new project_5_4();
        Oranges.setPrice(10, 2.99);
        Oranges.setNumberBought(24);
        System.out.println(Oranges.getTotalCost());

        project_5_4 Eggs = new project_5_4();
        Eggs.setPrice(12, 1.69);
        Eggs.setNumberBought(36);
        System.out.println(Eggs.getTotalCost());

        project_5_4 Apples = new project_5_4();
        Apples.setPrice(3, 1.00);
        Apples.setNumberBought(20);
        System.out.println(Apples.getTotalCost());

        project_5_4 Watermelons = new project_5_4();
        Watermelons.setPrice(1, 4.39);
        Watermelons.setNumberBought(2);
        System.out.println(Watermelons.getTotalCost());

        project_5_4 Bagels = new project_5_4();
        Bagels.setPrice(6, 3.50);
        Bagels.setNumberBought(12);
        System.out.println(Bagels.getTotalCost());
    }
}
