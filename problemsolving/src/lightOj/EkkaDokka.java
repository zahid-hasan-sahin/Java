package lightOj;

import java.util.Scanner;

public class EkkaDokka {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {

            long n = scan.nextLong();
            System.out.print("Case " + t++ + (": "));
            if (n % 2 == 1) {
                System.out.println("Impossible");
            } else {
                long tw = 0;
                while (true) {
                    ++tw;
                    if (((n / (long)Math.pow(2, tw))) % 2 == 1) {
                        break;
                    }
                }
                System.out.println( (n /(long) Math.pow(2, tw)) + " " + (long) Math.pow(2, tw));

            }
        }
    }

}
