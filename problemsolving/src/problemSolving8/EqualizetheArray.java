package problemSolving8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class EqualizetheArray {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                h.put(in, h.getOrDefault(in, 0) + 1);
            }
            int mx = 0;
            HashSet<Integer> a = new HashSet<Integer>();
            for (int i : h.values()) {
                a.add(i);
            }
            long res = Long.MAX_VALUE;
            for (int i : a) {
                long cal = 0;
                for (int j : h.values()) {
                    if (j < i) {
                        cal += j;
                    } else {
                        cal += (j - i);
                    }
                }
                res = Math.min(res, cal);
            }
            System.out.println(res);

        }
    }

}
