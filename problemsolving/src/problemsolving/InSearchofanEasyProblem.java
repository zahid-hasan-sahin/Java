package problemsolving;

import java.util.Scanner;

public class InSearchofanEasyProblem {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int hard = 0;
        for (int i = 0; i < total; i++) {
            int val = scan.nextInt();
            if (val == 1) {
                hard++;
            }

        }
        if (hard > 0) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }

    }

}
