package lightOj;

import java.util.Scanner;

class FibsievesFantabulousBirthday_1008 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int q = scan.nextInt();
        int t = 0;
        while (t++ < q) {
            long n = scan.nextLong();
            long k = (long)Math.sqrt(n);
            System.out.print("Case " + t + ": ");
            if (k % 2 == 0) {
                if (Math.pow(k, 2) == n) {
                    System.out.println(k + " " + 1);
                } else if (Math.pow(k, 2) + k + 1 >= n) {
                    System.out.println((k + 1) + " " + (long) (n - Math.pow(k, 2)));
                } else {
                    long p = (long) Math.pow(k, 2) + k + 1;
                    System.out.println((k - (n - p) + 1) + " " + (k + 1));
                }
            } else {
                if (Math.pow(k, 2) == n) {
                    System.out.println(1 + " " + k);
                } else if (Math.pow(k, 2) + k + 1 >= n) {
                    System.out.println((long) (n - Math.pow(k, 2)) + " " + (k + 1));
                } else {
                    long p = (long) Math.pow(k, 2) + k + 1;
                    System.out.println((k + 1) + " " + (k - (n - p) + 1));
                }
            }
        }

    }
}
