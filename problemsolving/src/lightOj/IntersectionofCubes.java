package lightOj;

import java.util.Scanner;

public class IntersectionofCubes {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int q = 1;
        while (t-- > 0) {
            int n = scan.nextInt();
            int xl = 0, yl = 0, zl = 0, xh = 2000, yh = 2000, zh = 2000;
            while (n-- > 0) {
                int x1 = scan.nextInt();
                int y1 = scan.nextInt();
                int z1 = scan.nextInt();

                int x2 = scan.nextInt();
                int y2 = scan.nextInt();
                int z2 = scan.nextInt();

                xl = Math.max(xl, x1);
                yl = Math.max(yl, y1);
                zl = Math.max(zl, z1);

                xh = Math.min(xh, x2);
                yh = Math.min(yh, y2);
                zh = Math.min(zh, z2);
            }
        
            System.out.print("Case " + q++ + ": ");
            if (xh > xl && yh > yl && zh > zl) {
                System.out.println((xh - xl) * (yh - yl) * (zh - zl));
            } else {
                System.out.println("0");
            }

        }
    }

}
