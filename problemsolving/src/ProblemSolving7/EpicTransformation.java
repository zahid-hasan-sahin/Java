package ProblemSolving7;

import java.util.HashMap;
import java.util.Scanner;

public class EpicTransformation {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                if (h.containsKey(in)) {
                    h.put(in, h.get(in) + 1);
                } else {
                    h.put(in, 1);
                }
            }
            int mx = 0;
            for (int i : h.values()) {
                mx = Math.max(mx, i);
            }
            if (n % 2 == 0) {
                int k = n / 2;
                if (k == mx) {
                    System.out.println(0);
                } else {
                    System.out.println(Math.max(0, mx - k + 1));
                }
            } else {
                int k = n / 2;
                if (k == mx) {
                    System.out.println(1);
                } else {
                    System.out.println(Math.max(1, mx - k + 1) - 1);
                }
            }

        }

    }

}
