package ProblemSolving5;

import java.util.Scanner;

public class DividingOrange {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] a = new int[k];
        int[] r = new int[n * k];
        for (int i = 0; i < k; i++) {
            a[i] = scan.nextInt();
            r[a[i] - 1] = 1;
        }
        for (int i = 0; i < k; i++) {
            System.out.print(a[i] + " ");
            int c = 1;
            for (int j = 0; j < n * k && n > c; j++) {
                if (r[j] == 0) {
                    System.out.print(j + 1 + " ");
                    r[j] = 1;
                    ++c;
                }
            }
            System.out.println();
        }
    }
}
