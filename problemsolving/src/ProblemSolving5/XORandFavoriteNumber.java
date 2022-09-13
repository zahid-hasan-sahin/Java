package ProblemSolving5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class XORandFavoriteNumber {

    public static class st {

        int l, r, ind;

    }
    static int sq = 0;

    public static class myCom implements Comparator<st> {

        @Override
        public int compare(st ob1, st ob2) {
            int f = ob1.l / sq;
            int l = ob2.l / sq;
            if (f == l) {
                return ob1.r - ob2.r;
            }
            return f - l;
        }

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();
        int k = scan.nextInt();
        int[] a = new int[n + 1];

        sq = (int) Math.ceil(Math.sqrt(n));
        for (int i = 1; i <= n; i++) {
            a[i] = scan.nextInt() ^ a[i - 1];
        }
        XORandFavoriteNumber.st[] ob = new XORandFavoriteNumber.st[q];
        for (int i = 0; i < q; i++) {
            ob[i] = new st();
            ob[i].l = scan.nextInt() - 1;
            ob[i].r = scan.nextInt();
            ob[i].ind = i;
        }
        Arrays.sort(ob, new myCom());
        long[] res = new long[q];
        int[] cnt = new int[10000010];
        int l = 1;
        int r = 0;
        long ans = 0;

        for (int i = 0; i < q; i++) {
            int b = ob[i].l;
            int c = ob[i].r;
            while (l < b) {
                int p = l++;
                --cnt[a[p]];
                int y = a[p] ^ k;
                ans -= cnt[y];

            }
            while (b < l) {
                int p = --l;
                int y = a[p] ^ k;
                ans += cnt[y];

                ++cnt[a[p]];

            }
            while (r < c) {
                int p = ++r;
                int y = a[p] ^ k;
                ans += cnt[y];

                ++cnt[a[p]];

            }
            while (r > c) {
                int p = r--;
                --cnt[a[p]];
                int y = a[p] ^ k;

                ans -= cnt[y];

            }
            res[ob[i].ind] = ans;

        }
        for (int i = 0; i < q; i++) {
            System.out.println(res[i]);
        }
    }
}
