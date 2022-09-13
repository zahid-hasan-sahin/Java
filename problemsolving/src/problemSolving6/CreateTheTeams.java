package problemSolving6;

import java.util.Arrays;
import java.util.Scanner;

public class CreateTheTeams {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int x = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            int i = n - 1;
            int j = n - 1;
            int res = 0;
            while (i >= 0 && j >= 0) {
                int k = a[i] * (j - i + 1);
                if (k >= x) {
                    ++res;
                    j = i - 1;
                }
                --i;
            }
            System.out.println(res);
        }
    }

}
