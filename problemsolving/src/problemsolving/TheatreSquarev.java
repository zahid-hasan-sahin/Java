package problemsolving;

import java.util.Scanner;

public class TheatreSquarev {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long m = scan.nextLong();
        long a = scan.nextLong();
        long x = 0;
        long y = 0;
        if (n % a == 0) {
            x = n / a;
        } else {
            x = (n / a) + 1;
        }
        if (m % a == 0) {
            y = m / a;
        } else {
            y = (m / a) + 1;
        }
        System.out.println(x * y);

    }

}
