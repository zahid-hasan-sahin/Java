package ProblemSolving4;

import java.util.HashSet;
import java.util.Scanner;

public class StringTransformation {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        t:
        while (t-- > 0) {
            int n = scan.nextInt();
            String a = scan.next();
            String b = scan.next();
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) > b.charAt(i)) {
                    System.out.println("-1");
                    continue t;
                }
            }
            int r = 0;
            for (int i = 0; i < n; i++) {
                HashSet<Character> c = new HashSet<Character>();
                while (i + 1 < n && b.charAt(i) == b.charAt(i + 1)) {
                    c.add(a.charAt(i));
                    ++i;
                }

                r = r + c.size();
            }

            System.out.println(r);

        }
    }

}
