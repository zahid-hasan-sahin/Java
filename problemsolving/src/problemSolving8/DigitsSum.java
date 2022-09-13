package problemSolving8;

import java.util.Scanner;

public class DigitsSum {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            ++n;
            System.out.println(n / 10);
        }

    }

}
