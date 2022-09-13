package ProblemSolving4;

import java.util.Scanner;

public class ComparingTwoLongIntegers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        int j = 0;
        while (j<a.length() && a.charAt(j) == '0') {
            ++j;
        }
        a = a.substring(j);
        j = 0;
        while (j<b.length() && b.charAt(j) == '0') {
            ++j;
        }
        b = b.substring(j);
        if (a.length() > b.length()) {
            System.out.println(">");
            return;
        } else if (a.length() < b.length()) {
            System.out.println("<");
            return;
        } else {
            for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
                if (a.charAt(i) > b.charAt(i)) {
                    System.out.println(">");
                    return;
                } else if (a.charAt(i) < b.charAt(i)) {
                    System.out.println("<");
                    return;
                }
            }
            System.out.println("=");
        }
    }
}
