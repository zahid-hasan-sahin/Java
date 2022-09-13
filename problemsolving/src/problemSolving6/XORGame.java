package problemSolving6;

import java.util.Scanner;

public class XORGame {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println((a ^ b) + " " + (a | b) + " " + (a & b));
            if ((a ^ b) == (a | b)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

    }

}
