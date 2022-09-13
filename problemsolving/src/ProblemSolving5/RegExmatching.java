package ProblemSolving5;

import java.util.Scanner;

public class RegExmatching {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        w:
        while (t-- > 0) {
            String a = scan.next();
            String b = scan.next();
            int k = -1;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == '^') {
                    k = 1;
                    a = a.substring(0, i) + a.substring(i + 1);
                    break;
                }
                if (a.charAt(i) == '$') {
                    k = 2;
                    a = a.substring(0, i) + a.substring(i + 1);
                    break;
                }
            }
            if (k == 1) {
                for (int i = 0; i < a.length(); i++) {
                    if (a.charAt(i) != b.charAt(i)) {
                        System.out.println(0);
                        continue w;
                    }
                }
            } else if (k == 2) {
                if (b.lastIndexOf(a) != b.length() - a.length()) {
                    System.out.println(0);
                    continue w;
                }

            } else {
                if (!b.contains(a)) {
                    System.out.println(0);

                    continue w;
                }
            }
            System.out.println(1);

        }

    }

}
