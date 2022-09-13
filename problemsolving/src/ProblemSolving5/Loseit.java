package ProblemSolving5;

import java.util.Scanner;

public class Loseit {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] r = new int[6];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == 4) {
                ++r[0];
            } else if (a[i] == 8 && r[0] > r[1]) {
                ++r[1];
            } else if (a[i] == 15 && r[1] > r[2]) {
                ++r[2];
            } else if (a[i] == 16 && r[2] > r[3]) {
                ++r[3];
            } else if (a[i] == 23 && r[3] > r[4]) {
                ++r[4];
            } else if (a[i] == 42 && r[4] > r[5]) {
                ++r[5];
            }
        }
        System.out.println(n - (r[5] * 6));
    }

}
