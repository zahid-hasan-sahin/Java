package admissiontest.problem3.part1;

import java.util.Scanner;

public class NumberDivider {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first value: ");
        int a = scan.nextInt();
        System.out.print("Enter second value: ");
        int b = scan.nextInt();
        try {
            if (b == 0) {
                throw new ArithmeticException("it attempts to divide by zero");
            }
            double res = (double) a / b;
            System.out.println(a + " / " + b + " = " + res);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
