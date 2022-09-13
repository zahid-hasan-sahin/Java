package ProblemSolving5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class InterestingQueries {

    public static class st {

        int l;
        int r;
        int ind;

    }
    static int sq = 0;

    public static class myCom implements Comparator<st> {

        @Override
        public int compare(st ob1, st ob2) {
            int f = ob1.l / sq;
            int l = ob2.l / sq;
            if (f == l) {
                if (ob1.r > ob2.r) {
                    return 1;
                }
                return -1;
            } else {
                if (f > l) {
                    return 1;
                }
                return -1;
            }

        }

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int qq = scan.nextInt();
        while (qq-- > 0) {
            int n = scan.nextInt();
            int q = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n + 1];
            sq = (int) Math.ceil(Math.sqrt(n));
            for (int i = 1; i <= n; i++) {
                a[i] = scan.nextInt();
            }
            InterestingQueries.st[] ob = new InterestingQueries.st[q];
            for (int i = 0; i < q; i++) {
                ob[i] = new st();
                ob[i].l = scan.nextInt();
                ob[i].r = scan.nextInt();
                ob[i].ind = i;
            }
            Arrays.sort(ob, new myCom());
            int[] res = new int[q];
            int l = 0;
            int r = 0;
            int count = 0;
            int[] oc = new int[10010];
            for (int i = 0; i < q; i++) {

                int b = ob[i].l;
                int c = ob[i].r;
                while (l < b) {
                    int p = a[l++];
                    if (oc[p] == k) {
                        --count;
                    }
                    --oc[p];

                }
                while (l > b) {
                    int p = a[--l];
                    ++oc[p];
                    if (oc[p] == k) {
                        ++count;
                    }
                }
                while (r > c) {
                    int p = a[r--];
                    if (oc[p] == k) {
                        --count;
                    }
                    --oc[p];
                }
                while (r < c) {
                    int p = a[++r];
                    ++oc[p];
                    if (oc[p] == k) {
                        ++count;
                    }
                }
                res[ob[i].ind] = count;
            }
            for (int i = 0; i < q; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();

        }
    }

}
