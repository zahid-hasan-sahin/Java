package ProblemSolving7;

import java.util.Arrays;
import java.util.Scanner;

public class AccidentalVictory {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long t = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = scan.nextInt();
            StringBuilder st = new StringBuilder();

            long[] a = new long[n];
            long[] b = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                b[i] = a[i];
            }
            Arrays.sort(a);
            long[] sum = new long[n];
            sum[0] = a[0];
            for (int i = 1; i < n; i++) {
                sum[i] = sum[i - 1] + a[i];
            }
            long pos = 0;
            for (int i = 0; i < n - 1; i++) {
                long s = sum[i];
                if (s < a[i + 1]) {
                    pos = a[i];
                }

            }
            int c = 0;
            for (int i = 0; i < n; i++) {
                if (b[i] > pos) {
                    ++c;
                    st.append((i + 1) + " ");
                }
            }
            sb.append(c + "\n" + st + "\n");

        }
        System.out.println(sb);
    }

}
