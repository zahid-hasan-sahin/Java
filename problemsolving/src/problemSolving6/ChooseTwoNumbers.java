package problemSolving6;

import java.util.Arrays;
import java.util.Scanner;

public class ChooseTwoNumbers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scan.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(a[n - 1] + " " + b[m - 1]);
    }
}
