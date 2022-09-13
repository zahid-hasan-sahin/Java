package problemSolving8;

import java.util.HashMap;
import java.util.Scanner;

public class TrainingSession {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long n = scan.nextInt();
            long res = (n * (n - 1) * (n - 2)) / 6;
            int[] a = new int[(int) n];
            int[] b = new int[(int) n];
            long[] fa = new long[(int) (n + 1)];
            long[] fb = new long[(int) (n + 1)];
            for (int i = 0; i < n; i++) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                ++fa[x];
                ++fb[y];
                a[i] = x;
                b[i] = y;
            }
            for (int i = 0; i < n; i++) {
                res -= (fa[a[i]] - 1) * (fb[b[i]] - 1);

            }
            System.out.println(res);
        }

    }

}
