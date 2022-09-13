package ProblemSolving5;

import java.util.Scanner;

public class GoodString {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        StringBuilder s = new StringBuilder(scan.next());
        StringBuilder res = new StringBuilder();
        res.append("5");
        for (int i = 0; i < s.length(); i++) {
            if (res.length() % 2 == 1 || res.charAt(res.length() - 1) != s.charAt(i)) {
                res.append(s.charAt(i));
            }
        }
        res.deleteCharAt(0);
        if (res.length() % 2 == 1) {
            res.deleteCharAt(res.length() - 1);
        }

        System.out.println(n - res.length());
        System.out.println(res);
    }

}
