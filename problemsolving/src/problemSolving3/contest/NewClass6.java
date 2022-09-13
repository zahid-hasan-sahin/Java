package problemSolving3;

import java.util.Scanner;

public class NewClass6 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();

            for (int i = 1; i <= n; i++) {
                String s = "";

                for (int j = 1; j <= m; j++) {
                    if (j == m && i == n - 1) {
                        s += "W";
                    } else if (i % 2 == 0) {
                        s += "B";

                    } else {
                        s += "W";

                    }

                }
                System.out.println(s);
            }

        }

    }

}
