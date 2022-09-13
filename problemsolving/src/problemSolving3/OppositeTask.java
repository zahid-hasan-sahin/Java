package problemSolving3;

import java.util.Scanner;

public class OppositeTask {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = n / 2;
            System.out.println(k + " " + (n - k));
        }

    }

}
