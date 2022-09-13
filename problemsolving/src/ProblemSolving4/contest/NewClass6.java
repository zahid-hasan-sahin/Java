package ProblemSolving4;

import java.util.Scanner;

public class NewClass6 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            if (n % 2 == 0) {
                System.out.println(n / 2 + " " + n / 2);
            } else {
                int p = 1;
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        p = Math.max(p, Math.max(i, n / i));
                    }
                }

                System.out.println(n - p + " " + p);

            }

        }

    }

}
