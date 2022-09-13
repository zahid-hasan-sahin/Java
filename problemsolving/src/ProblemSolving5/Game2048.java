package ProblemSolving5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Game2048 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[50000];
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                if (in <= 2048) {
                    ++a[in];
                }
            }
            for (int i = 0; i < 2047; i++) {
                while (a[i] >= 2) {
                    a[i * 2] = ++a[i * 2];
                    a[i] -= 2;
                }
            }
            if (a[2048] >= 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
