package problemsolving;

import java.util.Scanner;

public class MishkaandGame {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int mr = 0;
        int cr = 0;
        for (int i = 0; i < t; i++) {
            int m = scan.nextInt();
            int c = scan.nextInt();
            if (m > c) {
                mr++;
            } else if (c > m) {
                cr++;
            }
        }
        if (mr > cr) {
            System.out.println("Mishka");
        } else if (cr > mr) {
            System.out.println("Chris");
        } else {
            System.out.println("Friendship is magic!");
        }

    }
}
