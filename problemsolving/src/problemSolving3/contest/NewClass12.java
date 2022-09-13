package problemSolving3;

import java.util.Scanner;

public class NewClass12 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            if ((a + b) * n >= (c - d) && (a - b) * n <= (c + d)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }

}
