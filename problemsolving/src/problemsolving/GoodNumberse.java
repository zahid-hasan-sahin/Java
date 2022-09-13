package problemsolving;

import java.util.Scanner;

public class GoodNumberse {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long total = scan.nextLong();
        while (total > 0) {
            long n = scan.nextLong();
            long r = 0;
            for (long i = 0; i <= n; i++) {
                r = r + (long) Math.pow(3, i);
                if (n <= (long)Math.pow(3, i)) {
                    break;
                }
            }
            for (long i = 40; i >= 0; i--) {
                if (r -(long) Math.pow(3, i) >= n) {
                    r = r - (long) Math.pow(3, i);
                }
            }
            System.out.println(r);
            total--;
            r = 0;
        }
    }
}
