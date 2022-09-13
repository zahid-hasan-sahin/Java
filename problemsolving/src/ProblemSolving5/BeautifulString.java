package ProblemSolving5;

import java.util.Scanner;

public class BeautifulString {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            StringBuilder s = new StringBuilder();
            int n = s.length();

            for (int i = 1; i < n - 1; i++) {
                if (s.charAt(i) == '?') {
                    char k = s.charAt(i - 1);
                    if (k == 'c') {
                        k = 'a';
                    } else {
                        ++k;
                    }
                    s.replace(i, i + 1, String.valueOf((char) k));
                }
            }
        }
    }

}
