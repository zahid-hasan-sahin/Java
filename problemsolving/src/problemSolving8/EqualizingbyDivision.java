package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EqualizingbyDivision {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        sort(a);
        ArrayList<Integer>[] ar = new ArrayList[200010];
        for (int i = 0; i < 200010; i++) {
            ar[i] = new ArrayList<Integer>();
        }
        long[] sum = new long[200010];
        for (int i = 0; i < n; i++) {
            int x = a[i];
            int c = 0;
            ar[x].add(c);
            if (ar[x].size() < k) {
                sum[x] += c;
            }
            while (x != 0) {
                x = x / 2;
                ++c;
                if (ar[x].size() < k) {
                    sum[x] += c;
                }
                ar[x].add(c);
            }
        }
        long res = Integer.MAX_VALUE;
        for (int i = 0; i < 200010; i++) {
            if (ar[i].size() >= k) {

                res = Math.min(res, sum[i]);
            }
        }
        System.out.println(res);
    }

    static void sort(int[] a) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            ar.add(a[i]);
        }
        Collections.sort(ar);
        for (int i = 0; i < a.length; i++) {
            a[i] = ar.get(i);
        }
    }
}
