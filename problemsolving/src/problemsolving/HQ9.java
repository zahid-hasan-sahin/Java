package problemsolving;

import java.util.Scanner;

public class HQ9 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'H' || s.charAt(i) == 'Q' || s.charAt(i) == '9') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
