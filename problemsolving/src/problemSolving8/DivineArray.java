package problemSolving8;

import java.util.Scanner;

public class DivineArray {

    public static int log2(int N) {

        int result = (int) (Math.log(N) / Math.log(2));

        return result;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int[] fre = new int[n + 1];
            int lg = log2(n) + 10;
            int[][] res = new int[lg][n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                res[0][i] = a[i];
                ++fre[a[i]];
            }

            for (int i = 1; i < lg; i++) {
                for (int j = 0; j < n; j++) {
                    res[i][j] = fre[a[j]];
                    a[j] = res[i][j];
                }
                for (int j = 0; j <= n; j++) {
                    fre[j] = 0;
                }
                for (int j = 0; j < n; j++) {
                    fre[a[j]]++;
                }
            }
            int q = scan.nextInt();
            while (q-- > 0) {
                int x = scan.nextInt() - 1;
                int y = scan.nextInt();
                System.out.println(res[Math.min(y, lg - 1)][x]);

            }
        }
    }

}
