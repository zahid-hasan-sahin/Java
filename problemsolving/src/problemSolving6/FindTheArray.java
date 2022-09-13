package problemSolving6;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheArray {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int odd = 0;
            int even = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                if (i % 2 == 0) {
                    even += a[i];
                } else {
                    odd += a[i];
                }
            }
            if (odd > even) {
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 1) {
                        System.out.print(a[i] + " ");
                    } else {
                        System.out.print("1" + " ");
                    }
                }
            } else {
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        System.out.print(a[i] + " ");
                    } else {
                        System.out.print("1" + " ");
                    }
                }
      

            }
            System.out.println();
        }
    }
}
