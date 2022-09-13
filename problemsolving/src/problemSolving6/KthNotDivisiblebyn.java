package problemSolving6;

import java.util.Scanner;

public class KthNotDivisiblebyn {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int p = k / (n - 1);
            int q = k % (n - 1);
            if (q == 0) {
                System.out.println(n * p - 1);
            } else {
                System.out.println(n * p + q);
            }
        }
    }
}
