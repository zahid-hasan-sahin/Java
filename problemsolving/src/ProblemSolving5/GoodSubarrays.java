package ProblemSolving5;

import java.util.HashMap;
import java.util.Scanner;

public class GoodSubarrays {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
            int sm = 0;
            h.put(0, 1);
            long res = 0;
            for (int i = 0; i < n; i++) {
                sm += s.charAt(i) - '0';
                if (h.containsKey(sm - (i + 1))) {
                    res += h.get(sm - (i + 1));

                    h.put(sm - (i + 1), h.get(sm - (i + 1)) + 1);
                } else {
                    h.put(sm - (i + 1), 1);
                }

            }

            System.out.println(res);

        }
    }
}
