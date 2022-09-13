package ProblemSolving5;

import java.util.Scanner;

public class SubsetMex {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[110];

            for (int i = 0; i < n; i++) {
                ++a[scan.nextInt()];
            }
            int res = 0;
            for (int i = 0; i < 110; i++) {
                if (a[i] < 2) {
                    res += i;
                    break;
                }
            }
            for (int i = 0; i < 110; i++) {
                if (a[i] == 0) {
                    res += i;
                    break;
                }
            }
            System.out.println(res);

        }
    }

}
