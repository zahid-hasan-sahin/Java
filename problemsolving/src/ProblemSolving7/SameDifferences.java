package ProblemSolving7;

import java.util.HashMap;
import java.util.Scanner;

public class SameDifferences {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
            long res = 0;
            for (int i = 0; i < n; i++) {
                int k = a[i] - i;
                if (h.containsKey(k)) {
                    res += h.get(k);
                    h.put(k, h.get(k) + 1);
                } else {
                    h.put(k, 1);
                }
            }
            System.out.println(res);
        }
    }
}
