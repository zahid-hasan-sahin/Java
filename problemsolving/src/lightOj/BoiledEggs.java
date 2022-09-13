package lightOj;

import java.util.Arrays;
import java.util.Scanner;

public class BoiledEggs {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int qq = scan.nextInt();
        int t = 1;
        while (qq-- > 0) {
            int n = scan.nextInt();
            int p = scan.nextInt();
            int q = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            int r = 0;
            int s = 0;
            for (int i = 0; i < n; i++) {
                if (s + a[i] > q) {
                    break;
                }
                s += a[i];
                ++r;
            }
            System.out.print("Case "+t+++": ");
            System.out.println(Math.min(p, r));
        }
    }

}
