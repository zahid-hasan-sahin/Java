package problemSolving8;

import java.util.Scanner;

public class BalancedTernaryString {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        int[] a = new int[n];
        int z = 0;
        int o = 0;
        int t = 0;
        for (int i = 0; i < n; i++) {
            a[i] = s.charAt(i) - '0';
            if (a[i] == 0) {
                ++z;
            } else if (a[i] == 1) {
                ++o;
            } else {
                ++t;
            }
        }

        int k = n / 3;
        if (z < k) {
            for (int i = 0; i < n; i++) {
                if (a[i] == 2 && t > k && z < k) {
                    a[i] = 0;
                    --t;
                    ++z;
                }
            }
            for (int i = 0; i < n; i++) {
                if (a[i] == 1 && o > k && z < k) {
                    a[i] = 0;
                    --o;
                    ++z;
                }
            }

        }
        if (t < k) {

            for (int i = n - 1; i >= 0; i--) {
                if (a[i] == 0 && z > k && t < k) {
                    a[i] = 2;
                    --z;
                    ++t;
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                if (a[i] == 1 && o > k && t < k) {
                    a[i] = 2;
                    --o;
                    ++t;
                }
            }
        }

        if (o < k) {
            for (int i = n - 1; i >= 0; i--) {
                if (a[i] == 0 && z > k && o < k) {
                    a[i] = 1;
                    --z;
                    ++o;
                }
            }

            for (int i = 0; i < n; i++) {
                if (a[i] == 2 && t > k && o < k) {
                    a[i] = 1;
                    --t;
                    ++o;
                }
            }

        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
