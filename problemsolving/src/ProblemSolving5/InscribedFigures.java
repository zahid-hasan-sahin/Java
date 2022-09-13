package ProblemSolving5;

import java.util.Scanner;

public class InscribedFigures {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if ((a[i] == 2 && a[i + 1] == 3) || (a[i + 1] == 2 && a[i] == 3)) {
                System.out.println("Infinite");
                return;
            }
        }
        long res = 0;
        for (int i = 0; i < n - 1; i++) {
            if ((a[i] == 1 && a[i + 1] == 2) || (a[i] == 2 && a[i + 1] == 1)) {
                res += 3;
            } else if ((a[i] == 3 && a[i + 1] == 1) || (a[i] == 1 && a[i + 1] == 3)) {
                res += 4;
            }
        }
        int k = 0;
        for (int i = 0; i < n - 2; i++) {
            if (a[i] == 3 && a[i + 1] == 1 && a[i + 2] == 2) {
                ++k;
            }
        }
        System.out.println("Finite");
        System.out.println(res - k);
    }
}
