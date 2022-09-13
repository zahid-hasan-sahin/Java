package Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] arr = new int[n][m];
        Test[] a = new Test[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
            a[i] = new Test();
            a[i].ind = i;
            a[i].val = scan.nextInt();
        }
        int i = 0;
        int res = 2000000000;
        boolean b = false;
        while (i < n) {
            for (int j = i + 1; j < n; j++) {
                HashSet<Integer> h = new HashSet<Integer>();
                for (int k = 0; k < m; k++) {
                    h.add(arr[i][k]);
                }
                for (int k = 0; k < m; k++) {
                    h.add(arr[j][k]);
                }
                if (h.size() == m * 2) {
                    res = Math.min(res, (a[i].val + a[j].val));
                    b = true;
                }
            }
            ++i;
        }
        if (b) {
            System.out.println(res);
        } else {
            System.out.println(-1);
        }
    }
}

class Test {

    int ind;
    int val;
}
