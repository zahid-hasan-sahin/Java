
package problemsolving;

import java.util.Scanner;

public class Word {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int lower = 0;
        int upper = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                lower++;
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                upper++;
            }

        }
        String temp = "";
        if (lower < upper) {
            temp = s.toUpperCase();

        } else {
            temp = s.toLowerCase();

        }
        System.out.println(temp);

    }

}
