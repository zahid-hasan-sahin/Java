package lightOj;

import java.util.ArrayList;
import java.util.Scanner;

public class IntelligentFactorialFactorization {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int q = 1;
        ArrayList<Integer> pr = new ArrayList<Integer>();
        for (int i = 2; i < 100; i++) {
            int c = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    ++c;
                    break;
                }
            }
            if (c == 0) {
                pr.add(i);
            }
        }
        int k = pr.size();
        while (t-- > 0) {
            int[] a = new int[100];
            int n = scan.nextInt();
            for (int i = 2; i <= n; i++) {
                int u = i;
                for (int j = 0; j < k && pr.get(j) * pr.get(j) <= i && j * j <= i; j++) {
                    int c = 0;
                    int r = pr.get(j);
                    while (u % r == 0) {
                        ++c;
                        u /= r;
                    }
                    a[r] = a[r] + c;
                }
                if (u > 1) {
                    a[u] = a[u] + 1;
                }
            }
            int i = 0;
            while (a[i] == 0) {
                ++i;
            }
            System.out.print("Case " + q++ + ": " + n + " = ");
            System.out.print(i + " (" + a[i] + ")");
            for (i = i + 1; i < 100; i++) {
                if (a[i] != 0) {
                    System.out.print(" * " + i + " (" + a[i] + ")");
                }
            }
            System.out.println();
        }
    }
}
