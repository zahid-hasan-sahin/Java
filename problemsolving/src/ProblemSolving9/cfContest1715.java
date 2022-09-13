package ProblemSolving9;

import java.util.Scanner;

public class cfContest1715 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = scan.nextInt();
            long k = scan.nextLong();
            long b = scan.nextLong();
            long s = scan.nextLong();

            long gun = k * b;

            if (gun > s) {
                sb.append("-1\n");
            } else {
                if (s - gun >= k - 1) {
                    gun = gun + (k - 1);
                } else {
                    gun = gun + (s - gun);
                }

                long need = s - gun;
                long[] a = new long[n];
                long sum = gun;
                for (int i = 0; i < n - 1; i++) {

                    if (need <= k - 1) {
                        a[i] = need;
                    } else {
                        a[i] = k - 1;
                    }
                    need -= a[i];
                    sum += a[i];

                }
                a[n - 1] = gun;
                if (sum == s) {
                    for (int i = 0; i < n; i++) {
                        sb.append(a[i] + " ");
                    }
                    sb.append("\n");
                } else {
                    sb.append("-1\n");
                }

            }

        }
        System.out.println(sb);
    }

}
