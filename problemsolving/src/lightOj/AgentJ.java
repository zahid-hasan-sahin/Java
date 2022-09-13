package lightOj;

import java.util.Scanner;

public class AgentJ {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            double r1 = scan.nextDouble();
            double r2 = scan.nextDouble();
            double r3 = scan.nextDouble();
            double l1 = r1 + r2;
            double l2 = r2 + r3;
            double l3 = r1 + r3;
            double s = (l1 + l2 + l3) / 2.0;
            double a = Math.sqrt(s * (s - l1) * (s - l2) * (s - l3));

            double r1c = Math.toDegrees(Math.acos((l1 * l1 + l3 * l3 - l2 * l2) / (2 * l1 * l3)));
            double r2c = Math.toDegrees(Math.acos((l1 * l1 + l2 * l2 - l3 * l3) / (2 * l1 * l2)));
            double r3c = Math.toDegrees(Math.acos((l3 * l3 + l2 * l2 - l1 * l1) / (2 * l2 * l3)));
            double c1 = (r1c / 360) * Math.PI * r1 * r1;
            double c2 = (r2c / 360) * Math.PI * r2 * r2;
            double c3 = (r3c / 360) * Math.PI * r3 * r3;
            System.out.print("Case " + t++ + ": ");
            System.out.println(a - (c1 + c2 + c3));
        }
    }

}
