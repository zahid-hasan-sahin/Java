package problemsolving;

import java.util.Scanner;

public class LuckyDivision {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num % 4.0 == 0 || num % 7.0 == 0 || num % 47.0 == 0 || num % 74.0 == 0 || num % 477.0 == 0 || num % 744.0 == 0 || num % 747.0 == 0) {
            System.out.println("YES");

        } else {
            System.out.println("NO");
        }

    }
}
