package problemsolving;

import java.util.Scanner;

public class BalancedRatingChanges {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int a = 1;
        int sum = 0;
        for (int i = 0; i < total; i++) {
            sum = scan.nextInt();
            if (sum % 2 == 0) {
                System.out.println(sum / 2);
            } else {
                System.out.println((sum + a) / 2);
                a = -a;
            }

        }
    }
}
