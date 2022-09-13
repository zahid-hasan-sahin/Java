package Lab13;

import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter " + i + "th Number: ");
            int in = scan.nextInt();
            try {
                if (in < 0) {
                    throw new NegetiveNumberException();
                }
                sum += in;
            } catch (NegetiveNumberException e) {
                System.out.println(e.toString());
                --i;
            }

        }
        System.out.println(sum);
    }
}

class NegetiveNumberException extends Exception {

    NegetiveNumberException() {
        super("Input positive integer only");
    }
}
