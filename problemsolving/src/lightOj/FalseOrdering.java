package lightOj;

import java.util.Scanner;

public class FalseOrdering {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt(), t = 1;
        int[] a = new int[1001];
        for (int i = 0; i <= 1000; i++) {
            int c = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    ++c;
                    if (i / j != j) {
                        ++c;
                    }
                }
            }
            a[i] = c;
        }
        int[] r = new int[1001];
        for (int i = 0; i <= 1000; i++) {
            int m = 0;
            for (int j = 0; j <= 1000; j++) {
                if (a[m] >= a[j]) {
                    m = j;
                }
            }
            r[i] = m;
            a[m] = 7958437;
        }

        while (q-- > 0) {
            int n = scan.nextInt();
            System.out.print("Case "+t+++": ");
            System.out.println(r[n]);
        }
    }
}
