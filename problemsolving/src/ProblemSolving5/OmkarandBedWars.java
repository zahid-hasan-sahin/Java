package ProblemSolving5;

import java.util.Scanner;

public class OmkarandBedWars {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            StringBuilder s = new StringBuilder(scan.next());

            boolean b = true;
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) != s.charAt(i + 1)) {
                    b = false;
                }
            }
            if (b) {
                System.out.println((n + 2) / 3);
                continue;
            }
            char g = s.charAt(n - 1);
            while (s.charAt(0) == g) {
                s.append(g);
                s.delete(0, 1);
            }
            n = s.length();
            long res = 0;
            for (int i = 0; i < n; i++) {
                int p = i;
                if (s.charAt(i) == 'L') {
                    while (i < n && s.charAt(i) == 'L') {
                        ++i;
                    }
                } else {
                    while (i < n && s.charAt(i) == 'R') {
                        ++i;
                    }
                }
                --i;

                res += Math.floor((i + 1 - p) / 3);

            }
            System.out.println(res);
        }
    }
}
