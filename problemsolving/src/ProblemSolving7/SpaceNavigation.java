package ProblemSolving7;

import java.util.Scanner;

public class SpaceNavigation {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            String s = scan.next();
            int l = 0;
            int r = 0;
            int u = 0;
            int d = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'U') {
                    ++u;
                } else if (s.charAt(i) == 'R') {
                    ++r;
                } else if (s.charAt(i) == 'L') {
                    ++l;
                } else {
                    ++d;
                }
            }
            if (n < 0) {
                if (m < 0) {
                    if (l >= -n && d >= -m) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    if (l >= -n && u >= m) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            } else {
                if (m < 0) {
                    if (r >= n && d >= -m) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    if (r >= n && u >= m) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }

        }
    }

}
