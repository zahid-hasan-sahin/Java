package dp;

import java.util.Scanner;
import java.util.Stack;

public class Maxrectangle {

    static int mxRecArea(int[] a, int n) {
        Stack<Integer> s = new Stack<Integer>();
        s.add(0);
        int res = 0;
        for (int i = 1; i <= n + 1; i++) {
            if (a[s.peek()] <= a[i]) {
                s.add(i);
            } else {
                while (a[s.peek()] > a[i]) {
                    int k = s.pop();
                    int r = s.peek();
                    res = Math.max(res, a[k] * (i - r - 1));
                }

            }
        }
        return res;

    }

    static int maxArea(int[][] mt, int n, int m) {
        int[] a = new int[m + 2];
        int res = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (mt[i][j] == 1) {
                    a[j] += 1;
                } else {
                    a[j] = 0;
                }
            }
            res = Math.max(res, mxRecArea(a, m));
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] mt = new int[n + 1][m + 1];;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                mt[i][j] = scan.nextInt();
            }
        }

        System.out.println(maxArea(mt, n, m));
    }

}
