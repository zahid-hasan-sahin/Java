package ProblemSolving5;

import java.util.Scanner;

public class AddOddorSubtractEven {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a == b) {
                System.out.println(0);
            } else if (a > b) {
                int k = a - b;
                if (k % 2 == 0) {
                    System.out.println("1");
                } else {
                    System.out.println("2");
                }
            } else {
                int k = b - a;
                if (k % 2 == 1) {
                    System.out.println("1");
                } else {
                    System.out.println("2");
                }
            }
        }
    }
}
