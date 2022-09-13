package dp;

import java.util.Scanner;

public class KadanesAlgorithm {
    static int solve(Integer[] a,int n){
        int f = Integer.MIN_VALUE;
            int k = 0;
            for (int i = 0; i < n; i++) {
                k += a[i];
                if (f < k) {
                    f = k;
                }
                if (k < 0) {
                    k = 0;
                }
            }
            return f;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            System.out.println(solve(a,n));
            
        }
        
    }
}
