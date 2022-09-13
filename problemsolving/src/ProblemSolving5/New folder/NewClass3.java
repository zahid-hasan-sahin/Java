package ProblemSolving5;

import java.util.Arrays;
import java.util.Scanner;

public class NewClass3 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        t:
        while (q-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            long res = a[0] - 1;
            for (int i = 1; i < n; i++) {
                
                
            }
        }
    }

}
