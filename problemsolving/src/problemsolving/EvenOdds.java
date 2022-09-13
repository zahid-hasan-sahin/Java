package problemsolving;

import java.util.Scanner;

public class EvenOdds {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long k = scan.nextLong();
        if (k <= ((n / 2) + (n % 2))) {
            System.out.println((2 * k) - 1);
        } else {
            System.out.println(2 * (k - ((n / 2) + (n % 2))));
        }
    }
}
