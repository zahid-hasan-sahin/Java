package ProblemSolving4;

import java.util.Scanner;

public class MammothsGenomeDecoding {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[5];
        String s = scan.next();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A') {
                a[0]++;
            } else if (s.charAt(i) == 'C') {
                a[1]++;
            } else if (s.charAt(i) == 'G') {
                a[2]++;
            } else if (s.charAt(i) == 'T') {
                a[3]++;
            } else {
                a[4]++;
            }
        }
        int m = 0;
        for (int i = 0; i < 4; i++) {
            m = Math.max(m, a[i]);
        }
        boolean b = false;
        for (int i = 0; i < 4; i++) {
            if (m - a[i] > a[4]) {
                b = true;
                break;
            }
            a[i] = m - a[i];
            a[4] -= a[i];
        }
        
        if (a[4] % 4 == 0 && a[4]!=0) {
            for (int i = 0; i < 4; i++) {
                a[i] = a[i] + a[4] / 4;
            }
            b = false;
            a[4] = 0;
        }
        if (b || a[4] != 0) {
            System.out.println("===");
        } else {
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (a[j] == 0) {
                    while (j < 4 && a[j] == 0) {
                        ++j;
                    }
                }
                if (s.charAt(i) == '?') {
                    if (j == 0) {
                        System.out.print("A");
                    } else if (j == 1) {
                        System.out.print("C");
                    } else if (j == 2) {
                        System.out.print("G");
                    } else {
                        System.out.print("T");
                    }
                    --a[j];
                } else {
                    System.out.print(s.charAt(i));
                }
            }
        }
        System.out.println();
    }

}
