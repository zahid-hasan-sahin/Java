package ProblemSolving4;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeGenerator {

    static void pr(int n, int m) {
        if (n == 1) {
            ++n;
        }
        int mx = m - n + 1;

        int[] a = new int[100005];
        ArrayList<Integer> pr = new ArrayList<Integer>();
        for (int i = 2; i * i <= m; i++) {
            if (a[i] == 0) {
                pr.add(i);
                for (long j = i * i; j * j <= m; j += i) {
                  
                    a[(int)j] = 1;
                }
            }
        }

        int p = pr.size();
        for (int i = 0; i < p; i++) {
            int d = pr.get(i);
            if (d * d <= m) {
                int j = (n / d) * d;
                if (j < n) {
                    j += d;
                }
                for (; j <= m; j += d) {
                    if (j != d) {
                        a[j - n] = 1;
                    }
                }

            }

        }
        
        for (int i = 0; i < mx; i++) {
            if (a[i] == 0) {
                System.out.println(i + n);
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            pr(n, m);
        }
    }

}
