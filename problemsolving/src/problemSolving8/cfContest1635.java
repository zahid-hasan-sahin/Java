package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class cfContest1635 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();

            }
            if (a[n - 1] < 0) {
                for (int i = 0; i < n - 1; i++) {
                    if (a[i + 1] < a[i]) {
                        sb.append("-1\n");
                        continue k;
                    }
                }
                sb.append("0\n");
                continue k;
            }
            if (a[n - 2] > a[n - 1]) {
                sb.append("-1\n");
            } else {
                sb.append(n - 2 + "\n");
                for (int i = 0; i < n - 2; i++) {
                    sb.append((i + 1) + " " + (n - 1) + " " + n + "\n");
                }
            }
        }

        System.out.println(sb);
    }
}
