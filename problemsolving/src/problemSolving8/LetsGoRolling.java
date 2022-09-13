package problemSolving8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LetsGoRolling {

    static long[][] dp = new long[3001][3001];

    static long rec(st[] a, int i, int pre) {
        if (i >= a.length) {
            return 0;
        }
        if (dp[i][pre] != -1) {
            return dp[i][pre];
        }
        long x = Math.abs(a[i].x - a[pre].x) + rec(a, i + 1, pre);
        long y = a[i].c + rec(a, i + 1, i);
        return dp[i][pre] = Math.min(x, y);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        st[] a = new st[n];
        for (int i = 0; i < n; i++) {
            a[i] = new st();
            a[i].x = scan.nextInt();
            a[i].c = scan.nextInt();
        }
        Arrays.sort(a, new myCom());
        for (int i = 0; i < 3001; i++) {
            for (int j = 0; j < 3001; j++) {
                dp[i][j] = -1;
            }
        }
        long res = a[0].c + rec(a, 1, 0);
        System.out.println(res);
    }
}

class st {

    int x, c;

}

class myCom implements Comparator<st> {

    @Override
    public int compare(st ob1, st ob2) {
        int f = ob1.x;
        int l = ob2.x;
        return f - l;

    }

}
