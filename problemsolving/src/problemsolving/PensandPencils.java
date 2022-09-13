package problemsolving;

import java.util.Scanner;

public class PensandPencils {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        while (total > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            int e = scan.nextInt();

            if ((a / c) + (a % c == 0 ? 0 : 1) + (b / d) + (b % d == 0 ? 0 : 1) <= e) {

                System.out.print((a / c) + (a % c == 0 ? 0 : 1) + " ");
                System.out.println((b / d) + (b % d == 0 ? 0 : 1));

            } else {
                System.out.println("-1");
            }
            total--;
        }

    }

}
