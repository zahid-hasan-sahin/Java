package problemSolving8;

import java.util.HashMap;
import java.util.Scanner;

public class LuntikandSubsequences {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                a[i] = in;
                h.put(in, h.getOrDefault(in, 0) + 1);
            }
            long pow = (long) Math.pow(2, h.getOrDefault(0, 0));
            long res = 0;
            for (int i = 0; i < h.getOrDefault(1, 0); i++) {
                res += pow;
            }
            System.out.println(res);
        }
    }
}
