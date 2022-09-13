package ProblemSolving5;

import java.util.ArrayList;
import java.util.Scanner;

public class cfContest1708 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int q = scan.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int curr = 0;
            int[] res = new int[n];
            for (int i = n - 1; i >= 0; i--) {
                if (a[i] <= curr) {
                    res[i] = 1;
                } else if (curr < q) {
                    ++curr;
                    res[i] = 1;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(res[i]);
            }
            System.out.println();
        }
    }
}
