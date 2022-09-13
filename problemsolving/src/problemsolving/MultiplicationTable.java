package problemsolving;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int res = 0;
        for (int i = 2; i <= n; i++) {
            if (m % i == 0 && m / i <= n) {
                ++res;

            }
        }

        if (m <= n) {
            System.out.println(res + 1);
        } else {
            System.out.println(res);

        }
    }
}
