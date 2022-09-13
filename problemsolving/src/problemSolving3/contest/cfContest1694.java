package problemSolving3.contest;

import java.util.ArrayList;
import java.util.Scanner;

public class cfContest1694 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            long sum1 = 0;
            long sum2 = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                if (a[i] <= 0) {
                    sum2 += a[i];
                } else {
                    sum2 += a[i];
                }
            }

            if (sum1 == sum2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
