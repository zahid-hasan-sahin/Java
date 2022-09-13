package problemSolving3;

import java.util.Scanner;

public class PrefixSuffixPalindrome {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            int n = s.length();
            String a = "";
            String b = "";
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == s.charAt((n - 1) - i)) {
                    a = a + s.charAt(i);
                    b = s.charAt((n - 1) - i) + b;
                } else {
                    break;
                }
            }
            System.out.println(a + b);
        }
    }

}
