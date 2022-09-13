package problemSolving8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class NewClass {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            HashSet<Integer> hs = new HashSet<Integer>();
            int[] a = new int[n];
            int mn = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                hs.add(a[i]);
                if (a[i] > 0) {
                    mn = Math.min(mn, a[i]);
                }
            }
            if (hs.size() == 1 && a[0] <= 0) {
                System.out.println(n);
                continue;
            }
            Arrays.sort(a);
            int r = n - 1;
            mn = Math.min(mn, a[n - 1]);
            for (int i = 0; i < n; i++) {
                if (mn == a[i]) {
                    r = i;
                    break;
                }
            }

            int res = r + 1;
            for (int i = 0; i < r; i++) {
                if (Math.abs(a[i + 1] - a[i]) < mn) {
                    res -= 1;

                    break;
                }
            }
            if (mn == 0) {
                res = n;
            }
            System.out.println(res);
        }
    }
}
