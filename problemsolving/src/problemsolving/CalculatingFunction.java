package problemsolving;

import java.util.Scanner;

public class CalculatingFunction {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long odd = 0;
        long even = 0;
        if (n % 2 == 0) {
            odd = (n / 2) * (n / 2);
            even = (n / 2) * ((n / 2) + 1);
        } else {
            odd = ((n / 2) * (n / 2)) + n;
            even = (n / 2) * ((n / 2) + 1);
        }
        System.out.println(even - odd);

    }
}
