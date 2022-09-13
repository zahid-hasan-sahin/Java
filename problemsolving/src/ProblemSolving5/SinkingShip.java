package ProblemSolving5;

import java.util.Scanner;

public class SinkingShip {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s[] = new String[n];
        String a[] = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scan.next();
            a[i] = scan.next();
        }
        String[] p = {"rat", "woman", "child", "man", "captain"};
        int k = 0;
        for (int i = 0; i < n && k < 5; i++) {
           
            if (a[i].equals(p[k]) || (k == 1 && a[i].equals("child"))) {
                System.out.println(s[i]);
            }
            if (i == n - 1) {
                ++k;
                if (k == 2) {
                    ++k;
                }
                i = -1;
            }
        }
    }

}
