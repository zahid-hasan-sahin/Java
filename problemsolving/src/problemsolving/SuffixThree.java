package problemsolving;

import java.util.Scanner;

public class SuffixThree {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n-- > 0) {
            String s = scan.next();
            if (s.endsWith("po")) {
                System.out.println("FILIPINO");
            } else if (s.endsWith("desu") || s.endsWith("masu")) {
                System.out.println("JAPANESE");
            } else if (s.endsWith("mnida")) {
                System.out.println("KOREAN");

            }
        }

    }
}
