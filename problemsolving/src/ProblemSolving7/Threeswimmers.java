package ProblemSolving7;

import java.util.Scanner;

public class Threeswimmers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long n = scan.nextLong();
            long a = scan.nextLong();
            long b = scan.nextLong();
            long c = scan.nextLong();
            if (n % a == 0 || n % b == 0 || n % c == 0) {
                System.out.println("0");
                continue;
            }
            long res = ((n / a + 1) * a) - n;
            res = Math.min(res, ((n / b + 1) * b) - n);
            res = Math.min(res, ((n / c + 1) * c) - n);
            System.out.println(res);

        }

    }

}
