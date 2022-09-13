package problemSolving3;

import java.util.Scanner;

public class KindAnton {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int p = -1;
            int m = -1;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                if (a[i] == 1 && p < 0) {
                    p = i;
                } else if (a[i] == -1 && m < 0) {
                    m = i;
                }
            }
            for (int i = 0; i < n; i++) {
                b[i] = scan.nextInt();
            }
           
            for (int i = 0; i < n; i++) {
                if (i > p && p!=-1) {
                    if (a[i] <= b[i]) {
                        a[i] = b[i];
                    }
                }
                if (i > m && m!=-1) {
                    if (a[i] >= b[i]) {
                        a[i] = b[i];
                    }
                }

            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == b[i]) {
                    ++count;
                } else {
                    break;
                }
            }
            System.out.println(count == n ? "YES" : "NO");

        }

    }

}
