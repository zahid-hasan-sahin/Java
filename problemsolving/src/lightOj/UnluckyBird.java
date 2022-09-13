package lightOj;

import java.util.Scanner;

public class UnluckyBird {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            double v1 = scan.nextDouble();
            double v2 = scan.nextDouble();
            double v3 = scan.nextDouble();
            double a1 = scan.nextDouble();
            double a2 = scan.nextDouble();
            double t1 = v1 / a1;
            double t2 = v2 / a2;

            double s1 = 0.5 * a1 * t1 * t1;
            double s2 = 0.5 * a2 * t2 * t2;
            double d = s1 + s2;
            double c = Math.max(t1, t2) * v3;
            System.out.print("Case "+t+++": ");
            System.out.println(d + " " + c);

        }
    }

}
