package Assignment;

import java.text.DecimalFormat;
import java.util.Scanner;

class DoubleOut {

    /**
     * Displays amount in dollars and cents notation. Rounds after two decimal
     * places. Does not advance to the next line after output.
     */
    public static void write(double amount) {
        if (amount >= 0) {
            System.out.print('$');
            writePositive(amount);
        } else {
            double positiveAmount = amount;
            System.out.print('$');
            System.out.print('-');
            writePositive(positiveAmount);
        }
    }
    //Precondition: amount >= 0;
    //Displays amount in dollars and cents notation. Rounds
    //after two decimal places. Omits the dollar sign.

    private static void writePositive(double amount) {
        int allCents = (int) (Math.round(amount * 100));
        int dollars = allCents / 100;
        int cents = allCents % 100;
        System.out.print(dollars);
        System.out.print('.');
        if (cents < 10) {
            System.out.print('0');
        }
        System.out.print(cents);
    }

    /**
     * Displays amount in dollars and cents notation. Rounds after two decimal
     * places. Advances to the next line after output.
     */
    public static void writeln(double amount) {
        write(amount);
        System.out.println();
    }

    /**
     * Displays a number with digitsAfterPoint digits after the decimal point.
     * Rounds any extra digits. Does not advance to the next line after output.
     */
    public static void write(double number, int digitsAfterPoint) {
        if (number >= 0) {
            writePositive(number, digitsAfterPoint);
        } else {
            double positiveNumber = -number;
            System.out.print('−');
            writePositive(positiveNumber, digitsAfterPoint);
        }
    }

//Precondition: number >= 0
//Displays a number with digitsAfterPoint digits after
//the decimal point. Rounds any extra digits.
    private static void writePositive(double number,
            int digitsAfterPoint) {
        int mover = (int) (Math.pow(10, digitsAfterPoint));
        //1 followed by digitsAfterPoint zeros
        int allWhole; //number with the decimal point
        //moved digitsAfterPoint places
        allWhole = (int) (Math.round(number * mover));
        int beforePoint = allWhole / mover;
        int afterPoint = allWhole % mover;
        System.out.print(beforePoint);
        System.out.print('.');
        writeFraction(afterPoint, digitsAfterPoint);
    }
//Displays the integer afterPoint with enough zeros
//in front to make it digitsAfterPoint digits long.

    private static void writeFraction(int afterPoint,
            int digitsAfterPoint) {
        int n = 1;
        while (n < digitsAfterPoint) {
            if (afterPoint < Math.pow(10, n)) {
                System.out.print('0');
            }
            n = n + 1;
        }
        System.out.print(afterPoint);
    }

    /**
     * Displays a number with digitsAfterPoint digits after the decimal point.
     * Rounds any extra digits. Advances to the next line after output.
     */
    public static void writeln(double number,
            int digitsAfterPoint) {
        write(number, digitsAfterPoint);
        System.out.println();
    }

    public void scienceWrite(double d) {
        DecimalFormat f = new DecimalFormat("0.#####E0");
        System.out.println(f.format(d));
    }

    public void scienceWriteln(double d) {
        DecimalFormat f = new DecimalFormat("0.#####E0");
        System.out.println(f.format(d) + "\n");
    }

}

class Tester9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleOut ob = new DoubleOut();
        while (true) {
            System.out.print("Enter a double value:");
            double d = scan.nextDouble();
            ob.scienceWrite(d);
            ob.scienceWriteln(d);
            System.out.println("Do you want to Continue y/n");
            String s = scan.next();
            if (!s.equals("y")) {
                break;
            }
        }
    }
}
