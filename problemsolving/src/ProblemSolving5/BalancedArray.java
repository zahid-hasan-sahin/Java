package ProblemSolving5;

import java.util.Scanner;

public class BalancedArray {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            if (n % 4 == 0) {
                System.out.println("YES");
                long k = 0;
                int p = 2;
                for (int i = 0; i < n / 2; i++) {
                    System.out.print(p + " ");
                    k += p;
                    p += 2;
                }
                int e = 1;
                long r = 0;
                for (int i = 0; i < n / 2-1; i++) {
                    System.out.print(e + " ");
                    r += e;
                    e += 2;
                }
                System.out.println(k - r);
            } else {
                System.out.println("NO");
            }
        }
    }

}
