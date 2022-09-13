package problemsolving;

import java.util.Scanner;

public class ForgettingThings {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (b - a == 1) {
            System.out.print(a + "99 ");
            System.out.print(b + "00");
        } else if (a == b) {
            System.out.print(a + "12 ");
            System.out.print(b + "13");
        } else if (a == 9 && b == 1) {
            System.out.print(9+" ");
            System.out.print(10);
        } else {
            System.out.println(-1);
        }
        System.out.println();
    }
}
