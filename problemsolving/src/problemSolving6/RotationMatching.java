package problemSolving6;

import java.util.HashMap;
import java.util.Scanner;

public class RotationMatching {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n + 1];
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            h.put(scan.nextInt(), i);
        }
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            int k = h.get(in);
            if (i <= k) {
                ++a[k - i];
            } else {
                ++a[(n - i) + (k)];
            }
        }
        long res = 0;
        for (int i = 0; i < n + 1; i++) {
           res= Math.max(res,a[i]);
        }
        System.out.println(res);
    }
}
