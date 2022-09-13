package ProblemSolving7;

import java.util.Arrays;
import java.util.Scanner;

public class NoMoreInversions {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int p = (k - 1) * 2 + 1;
            int q = p - n;

            int[] res = new int[k];
            for (int i = 0; i < k; i++) {
                res[i] = i + 1;
            }
            for (int i = 0; i < q; i++) {
                sb.append(res[i] + " ");
            }
            Arrays.sort(res, q, k);
            for (int i = k - 1; i >= q; i--) {
                sb.append(res[i] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

}
