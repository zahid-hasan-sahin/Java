package ProblemSolving5;

import java.util.Scanner;

public class PhoenixandBalance {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long a = (long) Math.pow(2, n);
            for (int i = 1; i < n / 2; i++) {
                a += (long) Math.pow(2, i);
            }
            long b = 0;
            for (int i = n / 2; i < n; i++) {
                b += (long) Math.pow(2, i);
            }
            System.out.println(Math.abs(a - b));
        }
    }

}
