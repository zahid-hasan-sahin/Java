package problemSolving6;

import java.util.Scanner;

public class Offer {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int i = 0;
            int j = 0;
            int[] f = new int[1000010];
            long s = 0;
            long res = 0;
            
            while (i < n && j < n) {
                ++f[a[j]];
                if (f[a[j]] == 1) {
                    s += a[j];
                }
                while (i < n && s > k) {
                    --f[a[i]];
                    if (f[a[i]] == 0) {
                        s -= a[i];
                    }
                    ++i;
                }
                res = Math.max(res, j - i + 1);
                ++j;
            }
            System.out.println(res);
        }
    }
}
