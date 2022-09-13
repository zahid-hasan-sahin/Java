package ProblemSolving5;

import java.util.Scanner;

public class Postcardsandphotos {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String p = scan.next();
        String s[] = p.split("C", -1);
        String k[] = p.split("P", -1);
        int r = 0;
        for (int i = 0; i < s.length; i++) {
            r += Math.ceil(s[i].length() / 5.0);
        

        }
        for (int i = 0; i < k.length; i++) {
            r += Math.ceil(k[i].length() / 5.0);
        }
        System.out.println(r);
    }
}
