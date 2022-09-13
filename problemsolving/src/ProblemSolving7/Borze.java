package ProblemSolving7;

import java.util.ArrayList;
import java.util.Scanner;

public class Borze {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int n = s.length();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '.') {
                a.add(0);
            } else if (s.charAt(i) == '-') {
                if (s.charAt(i + 1) == '.') {
                    a.add(1);
                } else {
                    a.add(2);
                }
                i++;
            }
        }
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));
        }
        System.out.println();
    }
}
