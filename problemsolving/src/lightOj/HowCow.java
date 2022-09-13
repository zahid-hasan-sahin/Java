package lightOj;

import java.util.Scanner;

public class HowCow {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt(), t = 1;
        while (q-- > 0) {
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();
            int m = scan.nextInt();
            System.out.println("Case "+t+++":");
            while (m-- > 0) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                boolean b = x >= x1 && x <= x2 && y >= y1 && y <= y2;
                if (b) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }

            }
        }

    }

}
