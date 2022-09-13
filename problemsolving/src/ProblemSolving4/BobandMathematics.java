package ProblemSolving4;

import java.util.Scanner;

public class BobandMathematics {

    static int mod = 1000000007;
    static int m = 10000010;

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] pr = new int[m];
        pr[0] = pr[1] = 1;
        for (int i = 2; i < m; i++) {
            if (pr[i] == 0) {
                for (int j = i + i; j < m; j += i) {
                    pr[j] = 1;
                }
            }
        }

        while (t-- > 0) {
            int n = scan.nextInt();
        }
    }

}
