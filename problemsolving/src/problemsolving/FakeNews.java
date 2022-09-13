package problemsolving;

import java.util.Scanner;

public class FakeNews {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in); //heidi 
        String s = scan.next();
        boolean ch = false;
        boolean ce = false;
        boolean cfi = false;
        boolean cd = false;
        boolean cli = false;
        int ci = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'h') {
                ch = true;
                continue;
            }
            if (s.charAt(i) == 'e' && ch) {
                ce = true;
                continue;
            }
            if (s.charAt(i) == 'i' && ce && ci == 0) {
                cfi = true;
                ++ci;
                continue;

            }
            if (s.charAt(i) == 'd' && cfi) {
                cd = true;
                continue;
            }
            if (s.charAt(i) == 'i' && cd) {
                cli = true;
            }

        }
        if (ch && ce && cfi && cd && cli) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
