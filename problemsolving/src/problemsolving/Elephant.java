package problemsolving;

import java.util.Scanner;

public class Elephant {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int coor = scan.nextInt();
        int temp = 6;
        for (int i = 1; i <= 5; i++) {

            if (coor % i == 0) {
                if ((coor / i) < temp) {
                    temp = i;
                }

            }
        }
        if (temp == 6) {
            if (coor % 5 == 0) {
                System.out.println(coor / 5);
            } else {
                System.out.println((coor / 5) + 1);
            }
        } else {
            System.out.println(temp);
        }

    }

}
