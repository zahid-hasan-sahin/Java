package ProblemSolving5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubstringRemovalGame {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            int n = s.length();
            ArrayList<Integer> a = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    int q = i;
                    while (i < n && s.charAt(i) == '1') {
                        ++i;
                    }
                    a.add(i - q);
                }
            }
            Collections.sort(a, Collections.reverseOrder());
            long res = 0;
            for (int i = 0; i < a.size(); i += 2) {
                res += a.get(i);
            }
            System.out.println(res);

        }
    }
}
