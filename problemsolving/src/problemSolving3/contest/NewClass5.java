package problemSolving3;

import java.util.Scanner;

public class NewClass5 {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        while (true) {
            if (m >= 5) {
                m -= 3;
                --n;
            } else {
                m -= 2;
                --n;
            }
            if (m <= 0 || n == 0) {
                break;
            }
        }
        System.out.println(m < 0 ? 0 : m + "tk");
    }
}
