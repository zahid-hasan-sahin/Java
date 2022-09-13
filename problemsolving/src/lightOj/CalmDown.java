package lightOj;

import java.util.Scanner;

public class CalmDown {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            double r = scan.nextDouble();
            int n = scan.nextInt();
            double pi = 360.0 / (n * 2);
            System.out.print("Case "+t+++": ");
            
            System.out.println(r * (Math.sin(Math.toRadians(pi))) / (1 + Math.sin(Math.toRadians(pi))));

        }

    }

}
