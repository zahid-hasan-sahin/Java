package problemSolving6;

import java.util.Arrays;
import java.util.Scanner;

public class Team {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            int i = 0;
            int j = n - 1;
            int res = 0;
            while (j >= 0 && a[j] >= k) {
                --j;
                ++res;
            }
            while (i < j) {

                if (a[i] >= k) {
                    ++res;
                    ++i;
                    continue;
                }
                if (a[i] + a[j] >= k) {

                    ++res;
                    ++i;
                    --j;
                    continue;
                } else {
                    ++i;
                    continue;
                }
            }
            System.out.println(res);
        }

    }

}
