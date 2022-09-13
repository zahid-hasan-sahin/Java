package problemSolving3;

import java.util.Scanner;

public class main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}
