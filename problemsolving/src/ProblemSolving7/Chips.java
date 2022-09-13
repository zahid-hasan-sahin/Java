package ProblemSolving7;

import java.util.Scanner;

public class Chips {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long m = scan.nextLong();
        long k = (n * (n + 1)) / 2;
        long p = m - ((m / k) * k);

        for (int i = 1; i <= n; i++) {
            if (i > p) {
                System.out.println(p);
                break;
            }
            p -= i;
        }
    }

}
