package problemSolving3;

import java.util.Scanner;

public class NewClass14 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            if (a < b && b + d < b + c) {
                System.out.println(-1);
            } else {
                int p = a - b;
                int k = (b + d) - (b + c);
                if (k == 0) {
                    System.out.println(a);
                } else {
                    int y = p / k;
                    System.out.println(a + (c * y));
                }
            }
        }

    }
}
