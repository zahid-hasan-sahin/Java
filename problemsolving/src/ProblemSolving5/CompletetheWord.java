package ProblemSolving5;

import java.util.Scanner;

public class CompletetheWord {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int n = s.length();
        int[] a = new int[26];
        boolean b = false;
        for (int i = 0; i < n - 25; i++) {
            int k = 0;
            for (int j = i; j < i + 26; j++) {
                if (s.charAt(j) == '?') {
                    ++k;
                } else {
                    ++a[s.charAt(j) - 'A'];
                }
            }
            int c = 0;
            int e = 0;
            for (int j = 0; j < 26; j++) {
                if (a[j] == 1) {
                    ++c;
                }
                if (a[j] == 0) {
                    ++e;
                }
            }

            if (c == 26) {
                b = true;
                break;
            } else if (e == k) {
                for (int j = i; j < i + 26; j++) {
                    if (s.charAt(j) == '?') {
                        for (int l = 0; l < 26; l++) {
                            if (a[l] == 0) {
                                s = s.substring(0, j) + (char) ('A' + l) + s.substring(j + 1);
                                a[l] = 1;
                                break;
                            }
                        }
                    }
                }
                b = true;
                break;
            }
            for (int j = 0; j < 26; j++) {
                a[j] = 0;
            }
        }
        if (b) {
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '?') {
                    System.out.print("A");
                }else{
                    System.out.print(s.charAt(i));
                }
            }
            System.out.println();
        } else {
            System.out.println("-1");
        }
    }
}
