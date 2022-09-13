package ProblemSolving5;

import java.util.Scanner;

public class BerlandPoker {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int k = scan.nextInt();
            int p = Math.min(n / k, m);
            --k;
            int q = m - p;
            int u = Math.max(0, q - k);
            if (q != 0) {
                ++u;
            }
            System.out.println(Math.max(p - u, 0));
        }
    }
}
