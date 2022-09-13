package problemSolving2;

import java.util.Arrays;
import java.util.Scanner;

public class DiverseStrings {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n-- > 0) {
            String s = scan.next();
            char[] t = new char[s.length()];
            for (int i = 0; i < s.length(); i++) {
                t[i] = s.charAt(i);
            }
            Arrays.sort(t);
            boolean ch = false;

            for (int i = 0; i < t.length - 1; i++) {
                if (t[i] == t[i + 1] || t[i] + 1 != t[i + 1]) {
                    ch = true;
                    break;
                }
            }
            if (ch) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

        }

    }

}
