package ProblemSolving4;

import java.util.Scanner;

public class FromSToT {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();

        while (q-- > 0) {
            String s = scan.next();
            String t = scan.next();
            String p = scan.next();
            int n = t.length();
            boolean b = false;
            for (int i = 0; i < n; i++) {
                try {
                    if (s.charAt(i) != t.charAt(i)) {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    int y = p.indexOf(t.charAt(i));
                    if (y < 0) {
                        b = true;
                        break;
                    } else {
                        s = s.substring(0, i) + p.charAt(y) + s.substring(i);
                        p = p.substring(0, y) + p.substring(y + 1);
                    }
                }
            }

            if (s.equals(t) && !b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
