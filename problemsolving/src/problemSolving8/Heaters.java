package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;

public class Heaters {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();

        }
        int o = 0;
        int[] cnt = new int[n];
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                ++o;
                for (int j = i; j <= Math.min(i + r - 1, n - 1); j++) {
                    ++cnt[j];
                }
                for (int j = Math.max(0, i - r + 1); j < i; j++) {
                    ++cnt[j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (cnt[i] == 0) {
                System.out.println("-1");
                return;
            }
        }
        int res = o;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                boolean is = false;
                for (int j = i; j <= Math.min(i + r - 1, n - 1); j++) {
                    if (cnt[j] == 1) {
                        is = true;
                    }
                }
                for (int j = Math.max(0, i - r + 1); j < i; j++) {
                    if (cnt[j] == 1) {
                        is = true;
                    }
                }
                if (!is) {
                    for (int j = i; j <= Math.min(i + r - 1, n - 1); j++) {
                        --cnt[j];
                    }
                    for (int j = Math.max(0, i - r + 1); j < i; j++) {
                        --cnt[j];
                    }
                    --res;
                }
            }
        }
        System.out.println(res);
    }
}
