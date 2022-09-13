package ProblemSolving5;

import java.util.Scanner;

public class YetAnotherBookshelf {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int i = 0;
            for (i = 0; i < n; i++) {
                if (a[i] == 1) {
                    break;
                }
            }
            int j = n - 1;
            for (j = n - 1; j >= 0; j--) {
                if (a[j] == 1) {
                    break;
                }
            }
            long res = 0;
            for (int k = i; k < j; k++) {
                if(a[k]==0){
                    ++res;
                }
            }
            System.out.println(res);
        }
    }
}
