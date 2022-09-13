package problemsolving;

import java.util.Scanner;

public class NearlyLuckyNumber {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Long n = scan.nextLong();
        String s = String.valueOf(n);
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '7' || s.charAt(i) == '4') {
                c++;
            }
        }

        String t = String.valueOf(c);
        if (t.equals("7") || t.equals("4") || t.equals("47") || t.equals("74")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
