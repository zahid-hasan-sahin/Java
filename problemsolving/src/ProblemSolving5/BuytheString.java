package ProblemSolving5;

import java.util.Scanner;

public class BuytheString {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int c0 = scan.nextInt();
            int c1 = scan.nextInt();
            int h = scan.nextInt();
            int o = 0, z = 0;
            String s = scan.next();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    ++o;
                } else {
                    ++z;
                }
            }
            if (c0 + h < c1) {
                System.out.println(z * c0 + (o * (c0 + h)));

            } else if (c1 + h < c0) {
                System.out.println(o * c1 + (z * (c1 + h)));
            } else {
                System.out.println(o * c1 + z * c0);
            }
        }

    }
}
