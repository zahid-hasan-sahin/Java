package ProblemSolving4;

import java.util.Scanner;

public class Max {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
             System.out.print(a[i]+m+" ");
            if (a[i] + m > m) {
                m = a[i] + m;
            }
           
        }
        System.out.println();
    }

}
