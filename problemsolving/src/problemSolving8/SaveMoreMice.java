package problemSolving8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class SaveMoreMice {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {

            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            HashSet<Integer> h = new HashSet<Integer>();
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if (a[i] == a[j]) {
                        continue;
                    }
                    h.add(Math.abs(a[i] - a[j]));
                }
            }

            for (int i : h) {

            }

        }
    }

}
