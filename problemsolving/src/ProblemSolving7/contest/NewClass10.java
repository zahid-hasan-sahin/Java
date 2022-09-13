package ProblemSolving7;

import java.util.Scanner;

public class NewClass10 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        long mod = 1000000007;
        long[] f = new long[1000000];
        f[0] = 1;
        for (int i = 1; i < 1000000; i++) {
            f[i] = ((f[i - 1] % mod) * (2 % mod)) % mod;
        }

        while (t-- > 0) {
            String s = scan.next();
            int k = scan.nextInt();
            int n = s.length();
            int[] a = new int[s.length()];;
            for (int i = 0; i < s.length(); i++) {
                int u = s.charAt(i) - '0';
                int r = k;
                while (u != 10 && r > 0) {
                    ++u;
                    --r;
                }
                if (u == 10) {
                    a[i] = r;
                } else {
                    a[i] = -1;
                }
            }
            long res = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == -1) {
                    res = res + 1;
                    continue;
                }
                long w = a[i] / 10;
                System.out.println(w+" "+a[i]);
                res = res + f[(int) w + 1];
                if (a[i] % 10 == 9) {
                    res = res + f[(int) w];
                }
                System.out.println(res);
            }
            System.out.println(res);

        }
    }
}
