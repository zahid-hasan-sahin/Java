package problemSolving6;

import java.util.ArrayList;
import java.util.Scanner;

public class Box {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int[] res = new int[n];
            int mx = 0;
            int[] b = new int[n + 1];
            for (int i = 0; i < n; i++) {
                if (mx < a[i]) {
                    res[i] = a[i];
                    ++b[a[i]];
                } else if (mx > a[i]) {
                    System.out.println("-1");
                    continue k;
                }
                mx = Math.max(mx, a[i]);
            }
            ArrayList<Integer> ar = new ArrayList<Integer>();

            for (int i = 1; i <= n; i++) {
                if (b[i] == 0) {
                    ar.add(i);
                }
            }
            int k = 0;
            for (int i = 0; i < n; i++) {
                if (res[i] == 0) {
                    res[i] = ar.get(k);
                    ++k;
                }
            }
            mx = 0;
            for (int i = 0; i < n; i++) {
                mx = Math.max(mx, res[i]);
                if (mx != a[i]) {
                    System.out.println("-1");
                    continue k;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();

        }
    }
}
