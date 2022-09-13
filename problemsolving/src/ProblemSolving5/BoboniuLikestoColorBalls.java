package ProblemSolving5;

import java.util.Scanner;

public class BoboniuLikestoColorBalls {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int[] a = new int[4];
            for (int i = 0; i < 4; i++) {
                a[i] = scan.nextInt();
            }
            int z = 0;
            boolean ch = true;
            int b = 0;
            for (int i = 0; i < 4; i++) {
                if (a[i] % 2 == 1) {
                    ++b;
                } else {
                    ++z;
                }
                if (a[i] == 0 && i != 3) {
                    ch = false;
                }
            }
            int bi = 0;
            if (a[3] % 2 == 0) {
                --bi;
            }

            bi += z;
            if (a[3] % 2 == 0) {
                ++bi;
            }
           
            if (b <= 1) {
                System.out.println("Yes");
            } else if (bi <= 1 && ch) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
