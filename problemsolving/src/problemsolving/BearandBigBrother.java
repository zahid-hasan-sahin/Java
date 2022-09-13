package problemsolving;

import java.util.Scanner;

public class BearandBigBrother {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int limak = scan.nextInt();
        int bob = scan.nextInt();
        int year = 0;
        while (limak <= bob) {
            limak = limak * 3;
            bob = bob * 2;
            year++;
        }

        System.out.println(year);

    }

}
