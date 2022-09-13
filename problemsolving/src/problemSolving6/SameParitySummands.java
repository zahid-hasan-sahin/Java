package problemSolving6;

import java.util.Scanner;

public class SameParitySummands {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            if (n - k >= 0 && (n - (k - 1)) % 2 == 1) {
                System.out.println("YES");
                for (int i = 0; i < k - 1; i++) {
                    System.out.print(1 + " ");
                }

                System.out.println(n - (k - 1));
            } else if (n - (k * 2) >= 0 && (n - (k - 1) * 2) % 2 == 0) {
                System.out.println("YES");
                for (int i = 0; i < k - 1; i++) {
                    System.out.print("2 ");
                }

                System.out.println((n - (k - 1) * 2));
            } else {
                System.out.println("NO");
            }
        }
    }

}
