package problemSolving3;

import java.util.Scanner;

public class EhabtheXorcist {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long m = scan.nextLong();
        if (n - 1 == m) {
            if (n % 2 == 1) {
                System.out.println(m + " " + 1);
            }
        }
    }

}
