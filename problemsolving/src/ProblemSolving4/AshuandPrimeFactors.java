package ProblemSolving4;

import java.util.Scanner;

public class AshuandPrimeFactors {

    static int m = 1000001;
    static int[] prime = new int[m];

    public static void GenPrime() {
        for (int i = 2; i < m; i++) {
            if (prime[i] == 0) {
                int c = 0;
                for (int j = i; j < m; j += i) {
                    if (prime[j] == 0) {
                        ++c;
                        prime[j] = i;
                    }
                }
                prime[i] = c;
            }
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        GenPrime();
        while (t-- > 0) {
            int n = scan.nextInt();
            System.out.println(prime[n]);

        }

    }

}
