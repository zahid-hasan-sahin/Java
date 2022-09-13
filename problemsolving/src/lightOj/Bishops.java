package lightOj;

import java.util.Scanner;

public class Bishops {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();
            long k = Math.abs(x1 - x2) + Math.abs(y1 - y2);
            System.out.print("Case "+t+++": ");
            if (k % 2 == 0) {
                if (Math.abs(y1-y2)==Math.abs(x1-x2)) {
                    System.out.println("1");
                } else {
                    System.out.println("2");
                }
            } else {
                System.out.println("impossible");
            }
        }
    }
}
