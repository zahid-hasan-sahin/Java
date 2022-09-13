package problemSolving8;

import java.util.Scanner;

public class Cutemall {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] deg = new int[n + 1];

        for (int i = 0; i < n - 1; i++) {
            ++deg[scan.nextInt()];
            ++deg[scan.nextInt()];
        }
        if (n % 2 == 1) {
            System.out.println("-1");
            return;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (deg[i] % 2 == 0) {
                ++count;
            }
        }
        System.out.println(count);
    }
}
