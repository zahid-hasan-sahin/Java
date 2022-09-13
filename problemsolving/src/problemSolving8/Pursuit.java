package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Pursuit {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[5 * n + 1];
            int[] b = new int[5 * n + 1];
            ArrayList<Integer> ar = new ArrayList<Integer>();
            ArrayList<Integer> br = new ArrayList<Integer>();
            for (int i = 1; i <= n; i++) {
                ar.add(scan.nextInt());
            }
            for (int i = 1; i <= n; i++) {
                br.add(scan.nextInt());
            }
            Collections.sort(ar);
            Collections.sort(br);
            for (int i = 1; i <= n; i++) {
                a[i] = ar.get(i - 1);
            }
            for (int i = 1; i <= n; i++) {
                b[i] = br.get(i - 1);
            }
            for (int i = n + 1; i <= 5 * n; i++) {
                a[i] = 100;
            }
            for (int i = n + 1; i <= 5 * n; i++) {
                b[i] = 0;
            }
            long[] suma = new long[5 * n + 1];
            long[] sumb = new long[5 * n + 1];
            for (int i = 1; i < 5 * n + 1; i++) {
                suma[i] = suma[i - 1] + a[i];
            }
            for (int i = 1; i < 5 * n + 1; i++) {
                sumb[i] = sumb[i - 1] + b[i];
            }
            for (int i = n; i <= 5 * n; i++) {
                int p = i - (i / 4);
             //   System.out.println(suma[i] - suma[i - p] + " " + (sumb[i] - sumb[Math.max(0, n - p)]) + " " + p);
                if (suma[i] - suma[i - p] >= sumb[i] - sumb[Math.max(0, n - p)]) {
                    if (i <= n) {
                        System.out.println(0);
                    } else {
                        System.out.println(i - n);
                    }
                    break;
                }
            }

        }
    }

}
