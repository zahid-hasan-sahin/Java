package problemSolving8;

import java.util.Arrays;
import java.util.Scanner;

public class FairPlayoff {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int[] a = new int[4];
            int[] b = new int[4];
            for (int i = 0; i < 4; i++) {
                a[i] = scan.nextInt();
                b[i] = a[i];
            }
            Arrays.sort(b);
            int l = b[2];
            int r = b[3];
            if ((a[0] == l || a[0] == r || a[1] == l || a[1] == r) && (a[2] == l || a[2] == r || a[3] == l || a[3] == r)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
