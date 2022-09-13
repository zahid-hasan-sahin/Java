package dp;

public class coint_Change {

    static int[][][] dp = new int[5][1000][1000];
    static boolean[][][] vis = new boolean[5][1000][1000];

    static int subSet(int[] a, int[] b, int i, int toMake) {
        if (i >= a.length) {
            if (toMake == 0) {
                return 0;
            }
            return 1000000;
        }
        if (vis[i][toMake][b[i]]) {
      //      return dp[i][toMake][b[i]];
        }
        int st = b[i];
        int res1 = subSet(a, b, i + 1, toMake);
        int res2 = 1000000;

        if (a[i] <= toMake && b[i] > 0) {
            --b[i];
            res2 = subSet(a, b, i, toMake - a[i]) + 1;
        }
        b[i] = st;
        vis[i][toMake][b[i]] = true;
        return dp[i][toMake][b[i]] = Math.min(res1, res2);
    }

    public static void main(String args[]) {
        int[] a = {2, 4, 3, 5};
        int[] b = {400, 200, 300, 3};
        System.out.println(subSet(a, b, 0, 500));
    }

}
