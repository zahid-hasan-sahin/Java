package dp;

import java.util.ArrayList;
import java.util.Scanner;

public class Boredom {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        long[] f = new long[100010];
   
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            ++f[a[i]];
        }
       
        long[] res = new long[100010];
        res[1] = f[1];
        for (int i = 2; i < 100010; i++) {
            if (f[i] != 0) {
                res[i] = Math.max(res[i - 1], res[i - 2] + (long)i * f[i]);
            } else {
                res[i] = res[i - 1];
            }
        }
        System.out.println(res[100009]);

    }

}
