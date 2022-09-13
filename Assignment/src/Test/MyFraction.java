package Test;

import java.util.Scanner;

public class MyFraction {

    private int a;
    private int b;

    MyFraction() {
        a = 0;
        b = 1;
    }

    MyFraction(int x, int y) {
        a = x;
        b = y;
    }

    double result() {
        double res = a / (double) b;
        return res;
    }

}

class Test {

    public static void main(String[] args) {
        MyFraction[] arr = new MyFraction[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter numerator for fractional number " + i + ": ");
            int a = scan.nextInt();
            System.out.print("Enter denominator for fractional number " + i + ": ");
            int b = scan.nextInt();
            MyFraction ob = new MyFraction(a, b);
            arr[i] = ob;
        }
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            double r = arr[i].result();
            sum = sum + r;
        }
        System.out.println("Sum of Numbers:" + sum);
    }
}
