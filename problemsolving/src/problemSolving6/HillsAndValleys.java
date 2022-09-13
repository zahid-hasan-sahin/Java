package problemSolving6;

import java.util.Scanner;

public class HillsAndValleys {

    static int val(int[] a, int i) {
        if (i > 0 && i < a.length - 1 && a[i] < a[i - 1] && a[i] < a[i + 1]) {
            return 1;
        }
        return 0;
    }

    static int hil(int[] a, int i) {
        if (i > 0 && i < a.length - 1 && a[i] > a[i - 1] && a[i] > a[i + 1]) {
            return 1;
        }
        return 0;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int[] s = new int[n];
            int c = 0;
            for (int i = 1; i < n - 1; i++) {
                if (val(a, i) == 1 || hil(a, i) == 1) {
                    s[i] = 1;
                    ++c;
                }
            }
            int res = c;
            for (int i = 1; i < n - 1; i++) {
                int st = a[i];
                a[i] = a[i - 1];
                res = Math.min(res, c - s[i - 1] - s[i] - s[i + 1] + hil(a, i - 1) + hil(a, i) + hil(a, i + 1)
                        + val(a, i - 1) + val(a, i) + val(a, i + 1));
                a[i] = a[i + 1];
                res = Math.min(res, c - s[i - 1] - s[i] - s[i + 1] + hil(a, i - 1) + hil(a, i) + hil(a, i + 1)
                        + val(a, i - 1) + val(a, i) + val(a, i + 1));
                a[i] = st;
            }
            System.out.println(res);
        }
    }

}
