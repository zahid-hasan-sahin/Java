package ProblemSolving5;

import java.util.ArrayList;

import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class Decryption {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = a;
            a = b;
            b = t % b;
        }
        return a;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();

        while (q-- > 0) {
            int n = scan.nextInt();
            int e = n;
            ArrayList<Integer> a = new ArrayList<Integer>();

            int k = (int) Math.sqrt(n);
            for (int i = 2; i <= k; i++) {
                while (e % i == 0) {
                    a.add(i);
                    e /= i;

                }
            }
            if (e >= 2) {
                a.add(e);

            }

            int m = a.size();
            Set<Integer> s = new LinkedHashSet<>();
            for (int i = 0; i < m; i++) {
                int y = s.size();
                int[] tp = new int[y];
                int u = 0;
                for (int w : s) {
                    tp[u++] = w;
                }
                for (int j = y - 1; j >= 0; j--) {
                    s.add(tp[j] * a.get(i));
                }
                s.add(a.get(i));
            }
            s.remove(Integer.valueOf(n));
            s.add(n);
            ArrayList<Integer> g = new ArrayList<Integer>();
            g.addAll(s);
            s.add(n);

            for (int f : s) {
                System.out.print(f + " ");
            }
            System.out.println();
            int r = 0;
            for (int i = 0; i < g.size() - 1; i++) {
                if (gcd(g.get(i), g.get(i + 1)) == 1) {
                    ++r;

                }
            }
            if (g.size() != 1) {
                if (gcd(g.get(0), g.get(g.size() - 1)) == 1) {
                    ++r;
                }
            }
            System.out.println(r);

        }

    }

}
