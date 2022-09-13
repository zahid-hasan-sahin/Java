package lightOj;

import java.util.Scanner;

public class SecretOrigins {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt(), t = 1, n;
        while (q-- > 0) {
            n = scan.nextInt();
            String s = Integer.toBinaryString(n);
            String res = "";
            int in = -1;
            int k = 0;
            System.out.print("Case " + t++ + ": ");
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == '0' && s.charAt(i + 1) == '1') {
                    in = i;
                }
                if (s.charAt(i) == '1') {
                    ++k;
                }
            }
            if (s.charAt(s.length() - 1) == '1') {
                ++k;
            }
            if (k == 1) {
                System.out.println(n * 2);
                continue;
            } else {
                try {
                    res += s.substring(0, in) + "10";
                } catch (Exception e) {
                    res += '1';
                    for (int i = 0; i <= s.length() - k; i++) {
                        res += '0';
                    }
                    for (int i = 0; i < k - 1; i++) {
                        res += '1';
                    }
                    System.out.println(Long.parseLong(res, 2));
                    continue;
                }
                String temp = "";
                String e = "";
                for (int i = in + 2; i < s.length(); i++) {
                    if (s.charAt(i) == '1') {
                        temp += '1';
                    } else {
                        e += '0';
                    }
                }
                res += e + temp;
            }
            System.out.println(Long.parseLong(res, 2));
        }
    }
}