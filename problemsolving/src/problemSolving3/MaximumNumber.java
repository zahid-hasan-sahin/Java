package problemSolving3;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                System.out.print(1);
            }
        } else {
            System.out.print(7);
            n -= 3;
            for (int i = 0; i < n / 2; i++) {
                System.out.print(1);
            }
        }

        System.out.println();
    }

}
