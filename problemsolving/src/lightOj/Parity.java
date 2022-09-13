package lightOj;

import java.util.Scanner;

public class Parity {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int q = 1;
        while (t-- > 0) {
            int n = scan.nextInt();
            int r = 0;
            while (n != 0) {
                int k = 0;
                while (Math.pow(2, k) <= n) {
                    ++k;
                }
                n -= Math.pow(2, k - 1);
                ++r;
            }
            System.out.print("Case "+q+++": ");
            System.out.println(r%2==0?"even":"odd");
        }

    }

}
