package ProblemSolving5;

import java.util.Scanner;

public class NewClass10 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int q = scan.nextInt();
        while (q-- > 0) {
            String s = scan.next();
            int ch = s.charAt(0) - '0';
            long res = (ch - 1) * 10;         
            res += (s.length() * (s.length() + 1)) / 2;
         
            System.out.println(res);
        }

    }
}
