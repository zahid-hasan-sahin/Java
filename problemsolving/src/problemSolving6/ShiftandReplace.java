package problemSolving6;

import java.util.HashSet;
import java.util.Scanner;

public class ShiftandReplace {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n + 1];
        int c = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = scan.nextInt();
            if (i != a[i]) {
                ++c;
            }
        }
        int q = scan.nextInt();
        while (q-- > 0) {
            int p = scan.nextByte();
            int o = scan.nextInt();
            if (a[p] == p) {
                System.out.println("i");
                if (p != o) {
                    System.out.println("u");
                    ++c;
                }
            }
            if (a[p] != p && p == o) {
                System.out.println("K");
                --c;
            }
            a[p] = 0;
            System.out.println(c);
        }

    }
}
