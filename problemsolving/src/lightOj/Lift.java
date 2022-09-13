package lightOj;

import java.util.Scanner;

public class Lift {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt(), t = 1;
        while (q-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int y = 19;
            System.out.print("Case "+t+++": ");
            if (a < b) {
                System.out.println(b * 4 + y);
            } else {
                System.out.println((a - b + a) * 4 + y);
            }

        }

    }
}
