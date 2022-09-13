package problemSolving8;

import java.util.Scanner;

public class MinimumTies {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while (t-- > 0) {
            int n = scan.nextInt();
            if (n <= 4) {
                System.out.println(4 - n);
            } else {
                System.out.println(n%2);
            }
        }
    }

}
