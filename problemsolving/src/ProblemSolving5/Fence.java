package ProblemSolving5;

import java.util.Scanner;

public class Fence {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] a = new int[n];
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        s[0] = a[0];
        for (int i = 1; i < n; i++) {
            s[i] = s[i - 1] + a[i];

        }
        int r = 1;
        int m = s[k-1];
        
        for (int i = 0; i < n - k; i++) {
            int p = s[i + k] - s[i];
           
            if (p < m) {
                r = i + 2;
                m = p;
            }
        }
        System.out.println(r);

    }

}
