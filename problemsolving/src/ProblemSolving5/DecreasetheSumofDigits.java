package ProblemSolving5;

import java.util.Scanner;

public class DecreasetheSumofDigits {

    static long sumOfDigit(long n) {
        String s = String.valueOf(n);
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        return sum;
    }

    static long rec(long n, long s) {
        if (sumOfDigit(n) <= s) {
            return 0;
        }
        if (n % 10 == 0) {
            return rec(n / 10, s) * 10;
        }

        return rec(n + 10 - n % 10, s) + (10 - n % 10);

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long n = scan.nextLong();
            long s = scan.nextLong();
            System.out.println(rec(n, s));

        }
    }

}
