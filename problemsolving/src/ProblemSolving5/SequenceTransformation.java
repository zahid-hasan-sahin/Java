package ProblemSolving5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SequenceTransformation {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();

            }
            ArrayList<Integer> k = new ArrayList<Integer>();

            int e = 0;
            while (e < n) {
                int r = a[e];
                k.add(r);
                int p = e;
                while (e < n && a[p] == a[e]) {
                    ++e;
                }

            }

            HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
            for (int i = 0; i < k.size(); i++) {
                if (h.containsKey(k.get(i))) {
                    h.put(k.get(i), h.get(k.get(i)) + 1);
                } else {
                    h.put(k.get(i), 1);
                }
            }
            if (h.size() <= 1) {
                System.out.println(0);
                continue;
            }

            h.put(k.get(0), h.get(k.get(0)) - 1);
            if (n >= 2) {
                h.put(k.get(k.size() - 1), h.get(k.get(k.size() - 1)) - 1);
            }
            int mn = 1000000000;
            for (int p : h.values()) {
                mn = Math.min(mn, p);
              
            }
            System.out.println(mn + 1);
        }

    }
}
