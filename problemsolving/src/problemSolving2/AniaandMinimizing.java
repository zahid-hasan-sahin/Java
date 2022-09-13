package problemSolving2;

import java.util.Scanner;

public class AniaandMinimizing {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        String s = scan.next();
        int i = 0;
        String res = "";
        while (s.charAt(0) == '1' || s.charAt(i) == '0') {
            res += s.charAt(i);
            ++i;
            if (i >= n) {
                break;
            }
        }
        if (n > 1) {
            int ln = s.length();

            for (i = i; i < ln && k-- > 0; i++) {
                if (s.charAt(i) == '0') {
                    ++k;
                }
                if (i == 0) {
                    res += "1";
                } else {
                    res += "0";
                }

            }
            for (i = i; i < ln; ++i) {
                res += s.charAt(i);
            }
        } else {
            if (n == 1 && k >= 1) {
                res = "0";
            } else {
                res = s;
            }
        }
        System.out.println(res);

    }
}
