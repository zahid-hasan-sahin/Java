package problemSolving8;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayandOperations {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);

            long res = 0;

            for (int i = 0; i < k; i++) {
                int f = (n - k + i);
                int l = (n - k + i - k);

                res += a[l] / a[f];
            }

            for (int i = 0; i < n - k - k; i++) {
                res += a[i];
            }
            System.out.println(res);

        }
    }

}
