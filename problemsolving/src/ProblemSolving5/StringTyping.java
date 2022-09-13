package ProblemSolving5;

import java.util.Scanner;

public class StringTyping {

    static boolean con(String s, String k) {
        int p = k.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != k.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        
        int y = 0;
        int p = 0;
        for (int i = 0; i < n / 2 + 1; i++) {
            if (con(s.substring(0, i), s.substring(i, i + p))) {
                y = Math.max(y, i);
            }
            ++p;
        }
        if (y != 0) {
            --y;
        }

        System.out.println(s.length() - y);
    }

}
