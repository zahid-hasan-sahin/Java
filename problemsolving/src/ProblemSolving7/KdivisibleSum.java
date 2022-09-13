package ProblemSolving7;

import java.util.Scanner;

public class KdivisibleSum {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            if (n <= k) {
                int res = (int) Math.ceil((double) k / n);
                System.out.println(res);
            } else {
                int r = k * (n / k + 1);
                if (n % k == 0) {
                    r = n;
                }
                r = (int) Math.ceil((double) r / n);
                System.out.println(r);
            }

        }
    }

}
