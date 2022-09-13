package problemSolving8;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Backspace {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            String s = scan.next();
            String t = scan.next();
            int l = s.length() - 1;
            int r = t.length() - 1;
            while (l >= 0 && r >= 0) {
                if (s.charAt(l) == t.charAt(r)) {
                    --l;
                    --r;
                } else {
                    l -= 2;
                }
            }
            
            if (r < 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
