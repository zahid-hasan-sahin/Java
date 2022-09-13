package lightOj;

import java.util.Scanner;

public class JuiceintheGlass {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            double r1 = scan.nextDouble();
            double r2 = scan.nextDouble();
            double h = scan.nextDouble();
            double p = scan.nextDouble();
            double r = r2 + (r1 - r2) * ((p) / h);
            System.out.print("Case " + t++ + ": ");
            double res = (Math.PI * p * (Math.pow(r, 2) + r2 * r + Math.pow(r2, 2))) / 3.0;
            System.out.println(res);

        }
    }

}
