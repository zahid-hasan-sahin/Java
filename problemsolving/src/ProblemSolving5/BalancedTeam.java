package ProblemSolving5;

import java.util.Arrays;
import java.util.Scanner;

public class BalancedTeam {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        int res = 0;
        
        for (int i = 0,j = 0; i < n; i++) {
            while (j < n && a[j] - a[i] < 6) {
                ++j;
                res = Math.max(j - i, res);
            }

        }

        System.out.println(res);

    }

}
