package ProblemSolving5;

import java.util.Arrays;
import java.util.Scanner;

public class GIVEAWAY {

    static int bn(int[] a, int l, int r, int x) {
        int u = a.length;
        int k = r;
        while (l <= r) {
            int mid = (int) ((l + (long) r) / 2);
            if (mid >= u) {
                return k;
            }
            if (a[mid] == x) {
                r = mid - 1;
            } else if (a[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return r;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int k = (int) Math.sqrt(n);
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = arr[i];
        }
        for (int i = k; i < n; i += k) {
            Arrays.sort(s, i - k, i);
        }
        int q = scan.nextInt();
        while (q-- > 0) {
            int t = scan.nextInt();
            if (t == 0) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                int c = scan.nextInt();
                --a;
                --b;
                int l = a / k;
                int r = b / k;
                long res = 0;
                for (int i = a; i < Math.min(n, (l * k) + k); i++) {
                    if (arr[i] >= c) {
                        ++res;
                    }
                }
                for (int i = l + 1; i < r - 1; i++) {

                    res += (i * k + k - 1) - (bn(s, i * k, i * k + k - 1, c));

                }
                if (l != r) {
                    for (int i = r * k; i < Math.min(n, b + 1); i++) {
                        if (arr[i] >= c) {
                            ++res;
                        }
                    }
                }
                System.out.println(res);
            } else {
                int a = scan.nextInt();
                int b = scan.nextInt();
                int r = (a - 1) / k;
                arr[a - 1] = b;
                int[] e = new int[k];
                int p = k;
                for (int i = r * k; --p >= 0; i++) {
                    e[i] = arr[i];

                }
                Arrays.sort(e);
                p = k;
                for (int i = r * k; --p > 0; i++) {
                    s[i] = e[i];
                }
            }
        }
    }
}
