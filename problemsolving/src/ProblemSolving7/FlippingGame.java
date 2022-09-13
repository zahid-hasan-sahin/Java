package ProblemSolving7;

import java.util.Scanner;

public class FlippingGame {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int[] o = new int[n];
        int[] z = new int[n];
        int countOne = 0;
        int countZero = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                ++countZero;
            } else {
                ++countOne;
            }
            o[i] = countOne;
            z[i] = countZero;
        }
        int[] uo = new int[n];
        countOne = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] == 1) {
                countOne++;
            }
            uo[i] = countOne;
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == 0) {
                    if (j != n - 1) {
                        res = Math.max(res, z[j] + uo[j + 1]);
                    } else {
                        res = Math.max(res, z[j]);
                    }
                } else {
                    if (j != n - 1) {
                        res = Math.max(res, z[j] - z[i - 1] + o[i - 1] + uo[j + 1]);
                    } else {
                        res = Math.max(res, z[j] - z[i - 1] + o[i - 1]);
                    }
                }
            }
        }
        System.out.println(res);
    }

}
