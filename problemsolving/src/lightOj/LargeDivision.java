package lightOj;

import java.util.Scanner;

public class LargeDivision {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            String a = scan.next();
            int b = scan.nextInt();
            int i = 0;
            if (a.charAt(0) == '-') {
                i = 1;
            }
            long r = 0;
            for (; i < a.length(); i++) {
                r = r * 10 + (a.charAt(i) - '0');
                r = r % b;
            }
            System.out.print("Case " + t++ + ": ");
            if (r % b == 0) {
                System.out.println("divisible");
            } else {
                System.out.println("not divisible");
            }
        }
    }

}
