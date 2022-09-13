package ProblemSolving7;

import java.util.Arrays;
import java.util.Scanner;

public class StrangeBirthdayParty {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < m; i++) {
                b[i] = scan.nextInt();
            }
            Arrays.sort(a);
            int[] c = new int[n];
            for (int i = 0; i < n; i++) {
                c[i] = a[n - i - 1];
            }
            for (int i = 0; i < n; i++) {
                a[i] = c[i];
            }
            int q = 0;
            long res = 0;
            for (int i = 0; i < n; i++) {
                int k = b[a[i] - 1];
                if (k != q && q < m && b[q] < k) {
                    res += b[q];
                    ++q;
                } else {
                    res += k;
                }
            }
            System.out.println(res);
        }
    }

}
