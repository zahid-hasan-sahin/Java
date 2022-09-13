package lightOj;

import java.util.Scanner;

public class IPChecking {

    static boolean ch(int x, String y) {
        int s = 0;
        int k = Integer.valueOf(y);
  
        int i = 0;
        while (k > 0) {
            int m = k % 10;
            s += m * Math.pow(2, i++);
            k /= 10;
        
        }
        if (x == s) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            String s1 = scan.next();
            String s2 = scan.next();
            String a[] = new String[4];
            String b[] = new String[4];
            String s = "";
            int j = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == '.' || i == s1.length() - 1) {
                    if (i == s1.length() - 1) {
                        s += s1.charAt(i);
                    }
                    a[j++] = s;
                    s = "";
                } else {
                    s += s1.charAt(i);
                }
            }
            j = 0;
            for (int i = 0; i < s2.length(); i++) {
                if (s2.charAt(i) == '.' || i == s2.length() - 1) {
                    if (i == s2.length() - 1) {
                        s += s2.charAt(i);
                    }
                    b[j++] = s;
                    s = "";
                } else {
                    s += s2.charAt(i);
                }
            }
            int c = 0;
            for (int i = 0; i < 4; i++) {

                if (ch(Integer.valueOf(a[i]), b[i])) {
                    ++c;
                }
            }
            System.out.print("Case " + t++ + ": ");

            if (c == 4) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}
