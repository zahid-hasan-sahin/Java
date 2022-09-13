package problemSolving3;

import java.util.Scanner;

public class Divisibility {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextLong();
        double temp = n - (((n / 10) - (n / 9) - (n / 8) - (n / 7) - (n / 6)) + ((n / (10 * 9)) + (n / (10 * 8)) + (n / (10 * 7)) + (n / (10 * 6)) + (n / (9 * 8)) + (n / (9 * 7)) + (n / (9 * 6)) + (n / (8 * 7)) + (n / (8 * 6)) + (n / (7 * 6))) - ((n / (10 * 9 * 8)) - (n / (10 * 9 * 7)) - (n / (10 * 9 * 6)) - (n / (9 * 8 * 7)) - (n / (9 * 8 * 6)) - (n / (8 * 7 * 6)) - (n / (9 * 7 * 6)) - (n / (10 * 8 * 6)) - (n / (10 * 7 * 6)) - (n / (10 * 8 * 7))) + ((n / (10 * 9 * 8 * 7)) + (n / (10 * 9 * 8 * 6)) + (n / (9 * 8 * 7 * 6)) + (n / (10 * 8 * 7 * 6)) + (n / (10 * 9 * 7 * 6))) - (n / (10 * 9 * 8 * 7 * 6)));
        System.out.println(temp);
    }

}
