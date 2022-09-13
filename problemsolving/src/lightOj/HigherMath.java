package lightOj;

import java.util.Arrays;
import java.util.Scanner;

public class HigherMath {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int q = 1;
        while (t-- > 0) {
            int[] a = new int[3];
            for (int i = 0; i < 3; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            System.out.print("Case " + q++ + ": ");
            if ((a[0] * a[0]) + (a[1] * a[1]) == a[2] * a[2]) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

}
