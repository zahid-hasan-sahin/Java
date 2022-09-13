package problemSolving8;

import java.util.Scanner;

public class BoboniuandBitOperations {

    static boolean isSet(int n, int k) {
        if (((n >> (k))
                & 1) > 0) {
            return true;
        }
        return false;

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
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

        int[] res = new int[10];
        for (int i = 9; i >= 0; i--) {
            int c = 0;
            a:
            for (int j = 0; j < n; j++) {
                k:
                for (int k = 0; k < m; k++) {
                    if (!isSet(a[j] & b[k], i)) {
                        for (int l = 9; l > i; l--) {
                            if (res[l] == 0 && isSet(a[j] & b[k], l)) {
                                continue k;
                            }
                        }

                        ++c;
                        continue a;
                    }
                }
            }
            if (c != n) {
                res[i] = 1;
            }
        }
        int r = 0;
        for (int i = 9; i >= 0; i--) {
            if (res[i] == 1) {
                r += Math.pow(2, i);
            }
        }
        System.out.println(r);
    }
}
