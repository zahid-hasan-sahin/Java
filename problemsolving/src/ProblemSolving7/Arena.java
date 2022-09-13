package ProblemSolving7;

import java.util.Scanner;

public class Arena {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[]  a = new int[n];
            int mn = 1000000000;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                mn = Math.min(mn,a[i]);
            }
            int res = 0;
            for (int i = 0; i < n; i++) {
                if(a[i]!=mn){
                    ++res;
                }
            }
            System.out.println(res);
        }

    }

}
