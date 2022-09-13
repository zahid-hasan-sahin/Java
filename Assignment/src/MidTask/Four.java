package MidTask;

import java.util.Scanner;

public class Four {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String res = String.valueOf(Character.toUpperCase(s.charAt(0)));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == ' ') {
                res += Character.toUpperCase(s.charAt(i));
            } else {
                res += s.charAt(i);
            }
        }
        System.out.println(res);

    }

}
