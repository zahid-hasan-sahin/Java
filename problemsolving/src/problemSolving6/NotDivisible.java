package problemSolving6;

import java.util.HashSet;
import java.util.Scanner;

public class NotDivisible {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] f = new int[1000010];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            ++f[a[i]];
        }
        HashSet<Integer> ar = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            ar.add(a[i]);
        }
        int[] b = new int[1000010];
        for (int k : ar) {
            for (int i = k + k; i < 1000010; i += k) {
                b[i] = 1;
            }
        }
        int res = 0;
        for (int k : ar) {
            if (f[k] == 1) {
                if (b[k] == 0) {
                    ++res;
                }
            }
        }
        System.out.println(res);
    }

}
