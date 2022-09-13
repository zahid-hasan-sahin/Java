package problemSolving6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ZeroRemainderArray {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
            for (int i = 0; i < n; i++) {
                int r = k - (k + a[i]) % k;
                if (r == k) {
                    r = 0;
                }
                if (h.containsKey(r)) {
                    h.put(r, h.get(r) + 1);
                } else {
                    h.put(r, 1);
                }
            }
            int mx = 0;
            for (int w : h.keySet()) {
                if (w!=0) {
                  
                    mx = Math.max(h.get(w) * k, mx);
                }
               //   System.out.println(w + " " + h.get(w));
            }
            System.out.println(mx);

        }
    }
}
