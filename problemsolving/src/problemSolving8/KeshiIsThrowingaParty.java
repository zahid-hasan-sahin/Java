package problemSolving8;

import java.util.Scanner;

public class KeshiIsThrowingaParty {

    static boolean pos(int[] a, int[] b, int x) {
        int n = a.length;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (b[i] >= c && x - 1 - c <= a[i]) {
                ++c;
            }
        }
        if (c >= x) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                b[i] = scan.nextInt();
            }
            int l = 0;
            int r = n;
            int res = 0;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (pos(a, b, mid)) {
                    res = Math.max(res, mid);
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            System.out.println(res);
        }

    }
}
