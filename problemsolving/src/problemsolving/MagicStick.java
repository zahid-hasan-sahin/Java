package problemsolving;

import java.util.Scanner;

public class MagicStick {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        while (total-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x >= y) {
                System.out.println("YES");
            } else if (x > 3) {
                if(true)
                System.out.println("YES");

            } else {

                if ((x * 3) / 2 >= y) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

        }

    }
}
