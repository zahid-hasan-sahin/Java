package problemSolving2;

import java.util.Scanner;

public class NewYearandCountingCards {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                ++res;
            } else if (Character.isDigit(s.charAt(i))) {
                if (s.charAt(i) % 2 == 1) {
                    ++res;
                }
            }
        }
        System.out.println(res);

    }

}
