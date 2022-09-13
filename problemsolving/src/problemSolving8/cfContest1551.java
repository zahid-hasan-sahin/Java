package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;

public class cfContest1551 {

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
            int[] f = new int[n + 1];
            for (int i = 0; i < n; i++) {
                ++f[a[i]];
            }
            int[] last = new int[n + 10];
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                
                if (f[a[i]] >= k) {
                    if (last[a[i]] + 1 > k) {
                        continue;
                    }
                    res[i] = last[a[i]] + 1;
                    last[a[i]] = res[i];
                }
            }
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (f[i] >= k) {
                    continue;
                }
                sum += f[i];
            }
            int p = sum / k;

            int[] chose = new int[n + 10];

            for (int i = 0; i < n; i++) {
                if (f[a[i]] < k) {
                    int w = last[a[i]] + 1;
                    while (w <= k && chose[w] >= p) {
                        ++w;
                    }
                    if (w > k) {
                        continue;
                    }
                    ++chose[w];
                    res[i] = w;
                    last[a[i]] = w;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();

        }
    }
}
