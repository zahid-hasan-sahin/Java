package ProblemSolving5;

import java.util.Arrays;
import java.util.Scanner;

public class KeyPair {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        q:
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            int l = 0;
            int r = n - 1;
            int s = 0;
            while (r > l) {
                s = a[r] + a[l];
                if (s > k) {
                    --r;
                } else if (s < k) {
                    ++l;
                } else {
                    System.out.println("YES");
                    continue q;
                }
            }
            System.out.println("NO");

        }
    }
}
