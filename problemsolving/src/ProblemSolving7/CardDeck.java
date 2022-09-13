package ProblemSolving7;

import java.util.Scanner;

public class CardDeck {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n + 1];
            int[] max = new int[n + 1];
            int mx = 0;

            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            a[n] = n + 10;
            for (int i = 0; i <= n; i++) {
                max[i] = mx;
                if (a[i] > a[mx]) {
                    mx = i;
                }
            }

            int i = n;
            

            while (i >= 1) {
                int k = max[i];
                for (int j = k; j < i; j++) {
                    sb.append(a[j] + " ");
                }
                i = k;
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
