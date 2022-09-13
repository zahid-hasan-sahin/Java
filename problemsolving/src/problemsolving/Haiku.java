package problemsolving;

import java.util.Scanner;

public class Haiku {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String fs = scan.nextLine().replaceAll(" ", "");
        String ms = scan.nextLine().replaceAll(" ", "");
        String ls = scan.nextLine().replaceAll(" ", "");
        int cfs = 0;
        int cms = 0;
        int cls = 0;
        for (int i = 0; i < 100; i++) {
            if (i < ls.length()) {
                if (ls.charAt(i) == 'a' || ls.charAt(i) == 'e' || ls.charAt(i) == 'i' || ls.charAt(i) == 'o' || ls.charAt(i) == 'u') {
                    ++cls;
                }
            }
            if (i < ms.length()) {
                if (ms.charAt(i) == 'a' || ms.charAt(i) == 'e' || ms.charAt(i) == 'i' || ms.charAt(i) == 'o' || ms.charAt(i) == 'u') {
                    ++cms;
                }
            }
            if (i < fs.length()) {
                if (fs.charAt(i) == 'a' || fs.charAt(i) == 'e' || fs.charAt(i) == 'i' || fs.charAt(i) == 'o' || fs.charAt(i) == 'u') {
                    ++cfs;
                }
            }

        }
        if (cfs == 5 && cms == 7 && cls == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
