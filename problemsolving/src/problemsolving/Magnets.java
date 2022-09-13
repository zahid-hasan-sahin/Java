package problemsolving;

import java.util.Scanner;

public class Magnets {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        String[] s = new String[total];
        for (int i = 0; i < total; i++) {
            s[i] = scan.next();
        }
        int count = 0;
        for (int i = 0; i < s.length - 1; i++) {
            if ((s[i].contains("01") && s[i + 1].contains("10")) || (s[i].contains("10") && s[i + 1].contains("01"))) {
                count++;

            }

        }

        System.out.println(count + 1);

    }

}
