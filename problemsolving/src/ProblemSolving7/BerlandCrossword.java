package ProblemSolving7;

import java.util.Scanner;

public class BerlandCrossword {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            int w = a;
            int x = b;
            int y = c;
            int z = d;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < 2; k++) {
                        for (int l = 0; l < 2; l++) {
                            if (i == 1) {
                                --a;
                                --d;
                            }
                            if (j == 1) {
                                --a;
                                --b;
                            }
                            if (k == 1) {
                                --b;
                                --c;
                            }
                            if (l == 1) {
                                --d;
                                --c;
                            }
                            if (a >= 0 && b >= 0 && c >= 0 && d >= 0 && a <= n - 2 && b <= n - 2 && c <= n - 2 && d <= n - 2) {
                                System.out.println("YES");
                                continue k;
                            }
                            a = w;
                            b = x;
                            c = y;
                            d = z;
                        }
                    }
                }
            }
            System.out.println("NO");
        }
    }

}
