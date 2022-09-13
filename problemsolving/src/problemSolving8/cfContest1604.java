package problemSolving8;

import java.util.ArrayList;
import java.util.Scanner;

public class cfContest1604 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a == b) {
                System.out.println(a);
            } else if (a > b) {
                System.out.println(a + b);
            } else {

            }

        }

    }

}
