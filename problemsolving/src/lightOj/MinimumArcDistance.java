package lightOj;

import java.util.Scanner;

public class MinimumArcDistance {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            int o1 = scan.nextInt();
            int o2 = scan.nextInt();
            int a1 = scan.nextInt();
            int a2 = scan.nextInt();
            int b1 = scan.nextInt();
            int b2 = scan.nextInt();
            double oa = Math.sqrt(Math.pow(o1 - a1, 2) + Math.pow(o2 - a2, 2));
            double ob = Math.sqrt(Math.pow(o1 - b1, 2) + Math.pow(o2 - b2, 2));
            double ab = Math.sqrt(Math.pow(a1 - b1, 2) + Math.pow(a2 - b2, 2));
            double d = Math.toDegrees(Math.acos((oa * oa + ob * ob - ab * ab) / (2 * oa * ob)));
            double res = (d * Math.PI * ob) / 180;
            System.out.print("Case "+t+++": ");
            System.out.println(res);

        }
    }

}
