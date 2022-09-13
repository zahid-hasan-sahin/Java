package problemSolving6;

import java.util.Scanner;

public class Alcoholic {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt() * 100;
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }
        long k = 0;
        for (int i = 0; i < n; i++) {

            k += (a[i] * b[i]);

            if (k > x) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(-1);

    }
}
