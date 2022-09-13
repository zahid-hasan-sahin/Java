package ProblemSolving5;

import java.util.Scanner;

public class incARG {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        String t = "";
        int i = 0;

        for (; i < n; i++) {
            if (s.charAt(i) == '0') {
                ++i;
                break;
            }
        }
        System.out.println(i);
    }
}
