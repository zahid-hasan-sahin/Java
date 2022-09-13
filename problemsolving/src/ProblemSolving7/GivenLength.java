package ProblemSolving7;

import java.util.Scanner;

public class GivenLength {

    static boolean can(int n, int m) {
        return n >= 0 && n * 9 >= m;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        if (n == 1 && m == 0) {
            System.out.println("0 0");
            return;
        }
        if (m == 0) {
            System.out.println("-1 -1");
            return;
        }
        if (n * 9 < m) {
            System.out.println("-1 -1");
            return;
        }
        StringBuilder mn = new StringBuilder();
        int p = n;
        int r = m;
        k:
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < 10; j++) {
                if (can(n - 1, m - j) && m - j >= 0) {
                    if (i == 0 && j == 0) {
                        continue;
                    }
                    mn.append(j);
                    m -= j;
                    --n;
                    continue k;
                }
            }
        }
        m = r;
        n = p;
        StringBuilder mx = new StringBuilder();
        k:
        for (int i = 0; i < p; i++) {
            for (int j = 9; j >= 0; j--) {
                if (can(n - 1, m - j) && m - j >= 0) {
                    if (i == 0 && j == 0) {
                        continue;
                    }
                    mx.append(j);
                    m -= j;
                    --n;
                    continue k;
                }
            }

        }
        System.out.println(mn + " " + mx);
    }

}
