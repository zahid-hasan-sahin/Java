package lightOj;

import java.util.Scanner;

public class AreaofaParallelogram {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            int a1 = scan.nextInt();
            int a2 = scan.nextInt();
            int b1 = scan.nextInt();
            int b2 = scan.nextInt();
            int c1 = scan.nextInt();
            int c2 = scan.nextInt();
            double d1 = c1 - (b1 - a1);
            double d2 = a2 + (c2 - b2);
            double area = (a1 * b2) + (b1 * c2) + (c1 * d2) + (d1 * a2) - (b1 * a2) - (c1 * b2) - (d1 * c2) - (a1 * d2);
            area = Math.abs(area) / 2;
            System.out.print("Case " + t++ + ": ");
            System.out.println((int) d1 + " " + (int) d2 + " " + (int) area);

        }
    }

}
