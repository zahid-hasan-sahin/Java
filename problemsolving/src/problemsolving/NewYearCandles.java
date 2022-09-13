package problemsolving;

import java.util.Scanner;

public class NewYearCandles {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        for (int i = 1; i <= a; i++) {
            if (i % b == 0) {
                ++a;
            }

        }
        System.out.println(a);

    }

}
