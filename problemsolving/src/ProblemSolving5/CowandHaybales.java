package ProblemSolving5;

import java.util.Scanner;

public class CowandHaybales {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int d = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }

            int res = a[0];
            for (int i = 1; i < n; i++) {
                while (d - i >= 0 && a[i] - 1 >= 0) {
                    res += 1;
                    --a[i];
                    d -= i;

                }
            }
            System.out.println(res);
        }
    }

}
