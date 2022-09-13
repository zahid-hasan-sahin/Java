package problemsolving;

import java.util.Scanner;

public class PetyaandStrings {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String first = scan.next().toLowerCase();
        String last = scan.next().toLowerCase();
        int c = 0;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) > last.charAt(i)) {
                System.out.println("1");
                c = 0;
                break;

            } else if (first.charAt(i) < last.charAt(i)) {
                System.out.println("-1");
                c = 0;
                break;

            } else {
                c++;
            }

        }
        if (c > 0) {
            System.out.println("0");
        }

    }
}
