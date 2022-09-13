package ProblemSolving5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class UniqueBidAuction {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();

            HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                a[i] = in;
                if (h.containsKey(in)) {
                    int k = h.get(in);
                    h.put(in, k + 1);
                } else {
                    h.put(in, 1);
                }
            }
            int k = 0;
            int mn = 1000000000;
            for (int p : h.keySet()) {
                if (h.get(p) == 1) {
                    mn = Math.min(mn, p);
                }
            }

            for (int i = 0; i < n; i++) {
                if (a[i] == mn) {
                    System.out.println(i + 1);
                    ++k;
                    break;
                }
            }
            if (k == 0) {
                System.out.println("-1");
            }
        }
    }
}
