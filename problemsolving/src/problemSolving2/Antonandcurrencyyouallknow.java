package problemSolving2;

import java.util.Scanner;

public class Antonandcurrencyyouallknow {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int pos = 0;
        boolean ch = false;
        boolean b = true;

        for (int i = s.length() - 2; i >= 0; i--) {
            if (s.charAt(i) % 2 == 0 && b) {
                pos = i;
                b = false;
                ch = true;
            }
            if (s.charAt(i) % 2 == 0 && s.charAt(i) <= s.charAt(s.length() - 1)) {
                pos = i;
                ch = true;
            }

        }
        if (ch) {
            s = s.substring(0, pos) + s.charAt(s.length() - 1) + s.substring(pos + 1, s.length() - 1) + s.charAt(pos);
            System.out.println(s);
        } else {
            System.out.println("-1");
        }
    }

}
