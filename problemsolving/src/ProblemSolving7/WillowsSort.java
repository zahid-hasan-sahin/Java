package ProblemSolving7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WillowsSort {

    static String rev(String input) {
        char[] try1 = input.toCharArray();
        String s = "";
        for (int i = try1.length - 1; i >= 0; i--) {
            s += try1[i];
        }
        return s;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        int c = 1;
        while (t-- > 0) {
            int n = scan.nextInt();
            String[] s = new String[n];
            for (int i = 0; i < n; i++) {
                s[i] = scan.next();
            }
            ArrayList<String> ar = new ArrayList<String>();
            for (int i = 0; i < n; i++) {
                ar.add(rev(s[i]));
            }
            Collections.sort(ar);
            sb.append("Case " + c++ + ":\n");
            for (int i = 0; i < n; i++) {
                sb.append(rev(ar.get(i)) + "\n");
            }
        }
        System.out.println(sb.delete(sb.length() - 1, sb.length()));
    }
}
