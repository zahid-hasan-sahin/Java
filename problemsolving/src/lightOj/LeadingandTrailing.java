package lightOj;

import java.util.Scanner;

public class LeadingandTrailing {

    static long pow(int a, int b, int m) {
        long res = 1;
        while (b != 0) {
            if (b % 2 == 1) {
                res = ((res % m) * (a % m)) % m;
                --b;
            }
            a = ((a % m) * (a % m)) % m;
            b = b / 2;
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = 1;
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            double d = Math.log10(n) * k;
            d -= Math.floor(d);
            d = Math.pow(10, d) * 100;
            String s = String.valueOf((int) d);
            System.out.print("Case " + t++ + ": ");
            for (int i = s.length(); i < 3; i++) {
                System.out.print("0");
            }
            System.out.print(s + " ");
            String w = String.valueOf(pow(n, k, 1000));
            for (int i = w.length(); i < 3; i++) {
                System.out.print("0");
            }
            System.out.println(w);
        }
    }

}
