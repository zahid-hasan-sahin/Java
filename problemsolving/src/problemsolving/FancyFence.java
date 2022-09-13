package problemsolving;

import java.util.Scanner;

public class FancyFence {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        while (total-- > 0) {
            int input = scan.nextInt();
            if (360 % (180 - input) == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
