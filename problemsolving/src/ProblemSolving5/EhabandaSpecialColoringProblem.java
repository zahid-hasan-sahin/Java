package ProblemSolving5;

import java.util.Scanner;

public class EhabandaSpecialColoringProblem {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ++n;
        int[] a = new int[n];
        int k = 1;
        for (long i = 2; i < n; i++) {

            if (a[(int) i] == 0) {
                a[(int) i] = k;
                for (long j = i * i; j < n; j += i) {
                    a[(int) j] = k;
                }
                ++k;
            }
        }
        for (int i = 2; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

}
