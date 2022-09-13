package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;

public class Electrification {

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
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for (int i = 1; i < n; i++) {
                ar.add(a[i] - a[i - 1]);
            }
            n = ar.size();
            int[] pre = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                pre[i] = pre[i - 1] + ar.get(i - 1);
            }
            int sum = Integer.MAX_VALUE;
            int p = 0;
            for (int i = 1; i <= n - (k - 1); i++) {
                if (sum > pre[i + k - 1] - pre[i - 1]) {
                    sum = pre[i + k - 1] - pre[i - 1];
                    p = i;
                }
            }
            System.out.println(a[p - 1] + sum / 2);
        }

    }

}
