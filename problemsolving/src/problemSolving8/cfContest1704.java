package problemSolving8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class cfContest1704 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] a = new int[m];
            for (int i = 0; i < m; i++) {
                a[i] = scan.nextInt();
            }
            if (m == 1) {
                System.out.println(2);
                continue k;
            }

            Arrays.sort(a);
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for (int i = 0; i < m - 1; i++) {
                ar.add(a[i + 1] - a[i] - 1);
            }
            ar.add(n - a[m - 1] + a[0] - 1);
            Collections.sort(ar, Collections.reverseOrder());
            int c = 0;
            long res = 0;
            // System.out.println(ar);
            for (int i = 0; i < ar.size(); i++) {
                long p = res;
                res += Math.max(0, ar.get(i) - c);
                if (res != p && res - p != 1) {
                    --res;
                }
                //System.out.println(res);
                c += 4;
            }
            System.out.println(n - res);

        }
    }
}
