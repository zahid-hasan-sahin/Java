package problemSolving8;

import java.util.Scanner;

public class CoinRows {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scan.nextInt();
            }
            long[] sum = new long[n + 1];
            sum[n - 1] = a[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                sum[i] = sum[i + 1] + a[i];
            }
            long pre = 0;
            for (int i = 0; i < n; i++) {
                pre += b[i];
                if (sum[i + 1] >= pre) {
                    a[i] = 0;
                } else {
                    a[i] = 0;
                    for (int j = i; j < n; j++) {
                        b[j] = 0;
                    }
                    break;
                }
            }
            for (int i = 0; i < n; i++) {
                sum[i] = 0;
            }
            long[] sum2 = new long[n];
            sum[n - 1] = a[n - 1];
            sum2[n - 1] = b[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                sum[i] = sum[i + 1] + a[i];
                sum2[i] = sum2[i + 1] + b[i];
            }

            long res = 0;
            for (int i = 0; i < n; i++) {
                if (sum[i + 1] >= sum2[i]) {
                    res += a[i];

                } else {
                    res += a[i];

                    for (int j = i; j < n; j++) {
                        res += b[j];

                    }
                    break;
                }
            }
            System.out.println(res);

        }
    }

}
