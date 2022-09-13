package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class cfContest1617 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                a.add(scan.nextInt());
            }
            Collections.sort(a);

            Integer[] f = new Integer[n + 1];
            Integer[] f1 = new Integer[n + 1];
            for (int i = 0; i <= n; i++) {
                f[i] = 0;
                f1[i] = 0;
            }

            for (int i = 0; i < n; i++) {
                if (a.get(i) <= n) {
                    ++f[a.get(i)];
                    ++f1[a.get(i)];
                }
            }

            int c = 0;
            for (int i = 1; i <= n; i++) {
                if (f[i] == 0) {
                    ++c;
                }
            }

            int[] f2 = new int[n + 1];
            for (int i = 0; i < n; i++) {
                if (a.get(i) <= n && f1[a.get(i)] == 1) {
                    continue;
                }
                if (a.get(i) <= n) {
                    f1[a.get(i)]--;
                }
                int lim = a.get(i) / 2 - 1;
                if (a.get(i) % 2 == 1) {
                    ++lim;
                }
                if (lim <= n) {
                    ++f2[lim];
                } else {
                    f2[n]++;
                }

            }

            boolean b = true;
            int sum = 0;
            for (int i = n; i >= 1; i--) {
                sum += f2[i];
                if (f[i] == 0) {
                    --sum;
                }
                if (sum < 0) {
                    b = false;
                    break;
                }
            }
            if (!b) {
                System.out.println("-1");
            } else {
                System.out.println(c);
            }
        }

    }
}
