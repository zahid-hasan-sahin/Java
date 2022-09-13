package ProblemSolving5;

import java.util.Scanner;

public class Equator {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        long s = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            s += a[i];
        }
        int i = 0;
        long p = 0;
        long k = (int) Math.ceil(s / 2.0);
        for (i = 0; i < n; i++) {
            p += a[i];
            if (p >= k) {
                System.out.println(i+1);
                break;
            }
        }
    }

}
