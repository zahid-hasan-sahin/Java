package ProblemSolving7;

import java.util.Scanner;

public class DenseArray {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int res = 0;
            for (int i = 0; i < n - 1; i++) {
                int k = Math.min(a[i], a[i + 1]);
                while (k*2 < Math.max(a[i], a[i + 1])) {
                
                    k *= 2;
                    ++res;
                }
            }
            System.out.println(res);
        }
    }

}
