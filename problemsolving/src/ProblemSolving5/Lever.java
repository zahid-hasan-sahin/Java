package ProblemSolving5;

import java.util.Scanner;

public class Lever {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int p = s.indexOf("^");
        long l = 0;
        long r = 0;
        for (int i = 0; i < p; i++) {
            if (s.charAt(i) != '=') {
                l += (s.charAt(i) - '0') * (p - i);
            }
        }
        for (int i = p + 1; i < s.length(); i++) {
            if (s.charAt(i) != '=') {
                r += (s.charAt(i) - '0') * (i - p);
            }
        }
      
        if (l > r) {
            System.out.println("left");
        } else if (r > l) {
            System.out.println("right");
        } else {
            System.out.println("balance");
        }

    }
}
