package problemSolving8;

import java.util.HashMap;
import java.util.Scanner;

public class ZeroQuantityMaximization {

    static int g(int a, int b) {
        if (b == 0) {
            return a;
        }
        return g(b, a % b);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scan.nextInt();
        }
        long z = 0;
        int res = 0;
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {

            if (a[i] == 0 && b[i] == 0) {
                ++z;
            }
            if (a[i] == 0) {
                continue;
            }

        }

    }
}
