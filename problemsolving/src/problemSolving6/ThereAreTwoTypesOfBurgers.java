package problemSolving6;

import java.util.Scanner;

public class ThereAreTwoTypesOfBurgers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int b = scan.nextInt();
            int p = scan.nextInt();
            int f = scan.nextInt();
            int h = scan.nextInt();
            int c = scan.nextInt();
            if (h > c) {
                int k = Math.min(b / 2, p);
                b -= k * 2;
                k *= h;
                k += Math.min(b / 2, f) * c;
                System.out.println(k);
            } else {
                int k = Math.min(b / 2, f);
                b -= k * 2;
                k *= c;

                k += Math.min(b / 2, p) * h;
                System.out.println(k);
            }
        }
    }

}
