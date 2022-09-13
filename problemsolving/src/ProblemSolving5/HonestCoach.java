package ProblemSolving5;

import java.util.Arrays;
import java.util.Scanner;

public class HonestCoach {
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            int res = 1000000000;
            for (int i = 0; i < n - 1; i++) {
                res = Math.min(res,a[i+1]-a[i]);
            }
            System.out.println(res);
        }
    }
    
}
