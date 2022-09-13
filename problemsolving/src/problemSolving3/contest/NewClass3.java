package problemSolving3;

import java.util.Scanner;

public class NewClass3 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            double d = Math.sqrt(n);
            if (k == d) {
                System.out.println("YES");
            } else if (n % 2 == 0 && k % 2 == 0 && k < d) {
                System.out.println("YES");
            } else if (n % 2 == 1 && k % 2 == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
