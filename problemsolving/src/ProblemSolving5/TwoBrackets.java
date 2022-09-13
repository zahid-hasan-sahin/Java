package ProblemSolving5;

import java.util.Scanner;

public class TwoBrackets {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            int a = 0, b = 0, c = 0, d = 0;
            int r = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    ++a;
                }
                if (s.charAt(i) == ')' && a > b) {
                    ++b;
                    ++r;
                }
                if (s.charAt(i) == '[') {
                    ++c;
                }
                if (s.charAt(i) == ']' && c > d) {
                    ++d;
                    ++r;
                }
            }
            System.out.println(r);
        }
    }

}
