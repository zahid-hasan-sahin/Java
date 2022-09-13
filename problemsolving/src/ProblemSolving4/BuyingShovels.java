package ProblemSolving4;

import java.util.Scanner;

public class BuyingShovels {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int res = Integer.MAX_VALUE;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (i <= k) {
                        res = Math.min(res, n / i);
                    }
                    if (n / i <= k) {
                        res = Math.min(res, i);
                    }
                }
            }
            System.out.println(res);
        }

    }

}
