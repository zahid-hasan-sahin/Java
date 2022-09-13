package problemSolving3;

import java.util.Scanner;

public class BookReading {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long n = scan.nextLong();
            long m = scan.nextLong();
            long k = 0;
            for (long i = 1; i <= 10; i++) {
                String s = String.valueOf(m * i);
                k += s.charAt(s.length() - 1) - '0';
            }

            long temp = n / (m * 10);
            long res = k * temp;
            long p = 0;
            for (long i = temp * (m * 10); i <= n; i += m) {
                String s = String.valueOf(i);
                p += s.charAt(s.length() - 1) - '0';

            }
            System.out.println(res + p);
        }
    }

}
