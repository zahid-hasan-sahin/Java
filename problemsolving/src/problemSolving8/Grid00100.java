package problemSolving8;

import java.util.Scanner;

public class Grid00100 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                if (k > 0) {
                    a[i][i] = 1;
                    --k;
                } else {
                    break;
                }
            }
            boolean isLeft = true;
            int p = 1;
            int q = 1;
            for (int i = 1; i < 2 * n; i++) {
                if (isLeft) {
                    int j = p;
                    int l = 0;
                    while (j < n && l < n && k > 0) {
                        a[j][l] = 1;
                        --k;
                        ++j;
                        ++l;
                    }
                    isLeft = !isLeft;
                    p++;
                } else {
                    int j = q;
                    int l = 0;
                    while (j < n && l < n && k > 0) {
                        a[l][j] = 1;
                        --k;
                        ++j;
                        ++l;
                    }
                    isLeft = !isLeft;
                    q++;
                }
            }
            long mxR = 0;
            long minR = Integer.MAX_VALUE;
            long mxC = 0;
            long minC = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                long sum1 = 0;
                long sum2 = 0;
                for (int j = 0; j < n; j++) {
                    sum1 += a[i][j];
                    sum2 += a[j][i];
                }
                mxR = Math.max(mxR, sum1);
                minR = Math.min(minR, sum1);
                mxC = Math.max(mxC, sum2);
                minC = Math.min(minC, sum2);

            }
            long r = (mxR - minR) * (mxR - minR);
            long c = (mxC - minC) * (mxC - minC);
            System.out.println(r + c);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }

        }
    }
}
