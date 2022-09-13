package ProblemSolving7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Squarefreedivision {

    public static void main(String args[]) {
        ArrayList<Long> pr = new ArrayList<Long>();
        int[] mark = new int[10000010];
        for (long i = 2; i < 10000010; i++) {
            if (mark[(int) i] == 0) {
                pr.add(i);
                for (long j = i * i; j < 10000010; j += i) {
                    mark[(int) j] = 1;

                }
            }
        }

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                int x = a[i];
                for (int j = 0; pr.get(j) * pr.get(j) <= x; j++) {
                    long r = pr.get(j);
                    while (x % (r * r) == 0) {
                        x /= (r * r);
                    }
                }
                a[i] = x;
            }
            int res = 1;
            HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
            for (int i = 0; i < n; i++) {

                if (h.containsKey(a[i])) {
                    ++res;
                    h.clear();
                }
                h.put(a[i], 1);
            }
            System.out.println(res);

        }

    }

}
