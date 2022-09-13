package problemSolving6;

import java.util.HashSet;
import java.util.Scanner;

public class AddtoNeighbourandRemove {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                int mn = 0;
                int mx = 0;
                for (int j = 0; j < n; j++) {

                    if (a[mn] > a[i]) {
                        mn = i;
                    }
                    if (a[mx] < a[i]) {
                        mx = i;
                    }
                }
                if (mx == 0 && mn == 0) {
                    break;
                }
            }
        }
    }
}
