package problemSolving2;

import java.util.Scanner;

public class BeautifulString {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            String res = "";
            int rb = 0;
            int temp = 'a';
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) != '?') {
                    ++rb;
                    break;
                }
                if (s.charAt(i) == '?' && s.charAt(i+1) == '?') {
                    if ((char) temp > 'c') {
                        temp = 'a';
                    }
                    if ((char) temp == s.charAt(i - 1)) {
                        ++temp;
                    }
                    s = s.substring(0, i) + (char) temp + s.substring(i + 1, s.length());
                    ++temp;
                } else if (s.charAt(i) == '?' && s.charAt(i + 1) > 'a') {
                    if ((char) temp == s.charAt(i - 1)) {
                        ++temp;
                    }
                    if ((char) temp > 'c') {
                        temp = 'a';
                    }
                    if ((char) temp == s.charAt(i + 1)) {
                        ++temp;
                    }
                    s = s.substring(0, i) + (char) temp + s.substring(i + 1, s.length());
                    ++temp;
                }

            }
            if (rb > 0) {
                System.out.println("-1");
            } else {
                System.out.println(s);
            }

        }

    }
}
