package ProblemSolving5;

import java.util.Scanner;

public class PaymentWithoutChange {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int s = scan.nextInt();
            int p = Math.min(a, s / n);
            if (p * n + b >= s) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
