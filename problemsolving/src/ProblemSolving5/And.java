package ProblemSolving5;

import java.util.Scanner;

public class And {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] a = new int[n];
        int[] o = new int[100010];
        int[] t = new int[100010];
        boolean b = false;
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            a[i] = in;
            ++o[in];
            ++t[in & k];

        }
        for (int i = 0; i < 100010; i++) {
            if (o[i] >= 2) {
                System.out.println("0");
                return;
            }
        }
        for (int i = 0; i < n; i++) {

            if (o[a[i] & k] >= 1) {
                if ((a[i] & k) == a[i]) {
                    if (o[a[i] & k] >= 2) {
                        System.out.println("1");
                        return;
                    }
                } else {
                    System.out.println("1");
                    return;
                }

            }
        }
        for (int i = 0; i < 100010; i++) {
            if (t[i] >= 2) {
                System.out.println("2");
                return;
            }
        }
        System.out.println("-1");

    }

}
