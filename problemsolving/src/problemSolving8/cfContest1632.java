package problemSolving8;

import java.util.Scanner;

public class cfContest1632 {

    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }

        return gcd(b % a, a);
    }

    static boolean check(int[] a, int l, int r) {
        int g = 0;
        for (int i = l; i <= r; i++) {
            g = gcd(g, a[i]);
        }
        return g == 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = scan.nextInt();

        }
        int x = 0;
        int gcd = 0;
        int res = 0;
        for (int i = 1; i <= n; i++) {
            gcd = gcd(gcd, a[i]);

            if (a[i] == 1) {
                x = i;
                ++res;
            } else if (gcd == 1) {
                int l = x + 1;
                int r = i;
                int c = x + 1;
                while (l <= r) {
                    int mid = (l + r) / 2;
                    if (check(a, c, mid)) {
                        x = Math.max(mid, x);
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                    }
                }

                gcd = 0;
                for (int j = x + 1; j <= i; j++) {
                    gcd = gcd(gcd, a[j]);
                }

            }

            if (gcd != 1 && gcd <= i - x) {
                gcd = 0;
                ++res;
                x = i;
            }
            System.out.print(res + " ");

        }

    }
}
