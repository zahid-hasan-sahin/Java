package ProblemSolving4;

import java.util.Scanner;

public class NewClass3 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int o = 0;
            int e = 0;
            int l = 0;
            int k = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                if (a[i] % 2 == 1) {
                    ++o;
                    if (a[i] % 2 != i % 2) {
                        ++l;
                    }
                } else {
                    if (a[i] % 2 != i % 2) {
                        ++k;
                    }
                    ++e;
                }
            }

            if (l == k) {
                System.out.println(l);
            } else {
                System.out.println("-1");
            }
        }

    }

}
