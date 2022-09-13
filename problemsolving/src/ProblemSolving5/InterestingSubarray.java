package ProblemSolving5;

import java.util.Scanner;

public class InterestingSubarray {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        q:
        while (t-- > 0) {
            int n = scan.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                if (Math.abs(a[i] - a[i + 1]) >= 2) {                 
                    System.out.println("YES");
                    System.out.println(i+1+" "+(i+2));
                    continue q;
                }
            }
            System.out.println("NO");

        }
    }
}
