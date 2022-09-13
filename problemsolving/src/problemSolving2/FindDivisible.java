package problemSolving2;

import java.util.Scanner;

public class FindDivisible {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int mn = scan.nextInt();
            int mx = scan.nextInt();
            System.out.println(mn + " " + mn * 2);
        }

    }

}
