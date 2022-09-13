package problemSolving8;

import java.util.Scanner;

public class GameOnLeaves {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int x = scan.nextInt();
            int[] f = new int[n + 10];
            for (int i = 0; i < n - 1; i++) {
                int u = scan.nextInt();
                int v = scan.nextInt();
                ++f[u];
                ++f[v];
            }
            if (f[x] == 0 || f[x] == 1) {
                System.out.println("Ayush");
            } else {
                if (n % 2 == 0) {
                    System.out.println("Ayush");
                } else {
                    System.out.println("Ashish");
                }
            }
        }

    }

}
