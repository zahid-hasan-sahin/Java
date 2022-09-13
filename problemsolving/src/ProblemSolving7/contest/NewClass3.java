package ProblemSolving7;

import java.util.*;
import java.lang.*;
import java.io.*;

public class NewClass3 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = scan.nextInt();
            int[] mi = new int[n];
            int[] di = new int[n];
            int p = 0;
            int q = 0;
            for (int i = 0; i < 2 * n; i++) {
                int x = Math.abs(scan.nextInt());
                int y = Math.abs(scan.nextInt());
                if (x == 0) {

                    mi[p++] = y;
                } else {
                    di[q++] = x;

                }
            }
            Arrays.sort(mi);
            Arrays.sort(di);
            double res = 0;
            for (int i = 0; i < n; i++) {
                res += Math.sqrt((1l * di[i] * di[i]) + (1l * mi[i] * mi[i]));
            }
            System.out.println(res);
        }

    }
}
