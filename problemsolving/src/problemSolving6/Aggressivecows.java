package problemSolving6;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressivecows {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int w = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            int l = 0;
            int r = 1000000010;
            int res = 0;
            while (l <= r) {
                int m = (l + r) / 2;
                int k = 1;
                int p = a[0];
                int j = 1;
                while (j < n) {
                    if (a[j] - p >= m) {
                        ++k;
                        p = a[j];
                        ++j;
                    } else {
                        ++j;
                    }
                }

                if (k >= w) {
                    l = m + 1;
                    res = m;
                } else {
                    r = m - 1;
                }
            }
            System.out.println(res);
        }

    }
}
