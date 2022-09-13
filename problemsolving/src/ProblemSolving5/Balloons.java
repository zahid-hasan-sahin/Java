package ProblemSolving5;

import java.util.Scanner;

public class Balloons {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            if (n == 1) {
                System.out.println(-1);
            } else if (n == 2 && a[0] == a[1]) {
                System.out.println(-1);
            } else {
                int mn = 0;
                for (int i = 0; i < n; i++) {
                    if (a[mn] > a[i]) {
                        mn = i;
                    }
                }
                System.out.println("1");
                System.out.println(mn+1);
            }
        
    }
}
