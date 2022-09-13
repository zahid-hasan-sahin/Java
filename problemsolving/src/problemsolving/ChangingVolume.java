package problemsolving;

import java.util.Scanner;

public class ChangingVolume {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        while (total-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a == b) {
                System.out.println("0");
            } else {
                if (((b - a) % 5) == 3 || ((b - a) % 5) == 4) {
                    System.out.println(((b - a) / 5) + 2);
                } else if (((b - a) % 5) == 1 || ((b - a) % 5) == 2) {
                    System.out.println(((b - a) / 5) + 1);
                } else if (b < a) {
                    if ((Math.abs(b - a) % 5) == 4 || (Math.abs(b - a) % 5) == 3) {
                        System.out.println((Math.abs(b - a) / 5) + 2);
                    } else if ((Math.abs(b - a) % 5) == 1 || (Math.abs(b - a) % 5) == 2) {
                        System.out.println((Math.abs(b - a) / 5) + 1);
                    } else {
                        System.out.println(Math.abs(b-a) / 5);
                    }
                } else {
                    System.out.println((b-a) / 5);
                }

            }

        }

    }
}
