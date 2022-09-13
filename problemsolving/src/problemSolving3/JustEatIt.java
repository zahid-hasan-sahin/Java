package problemSolving3;

import java.util.Scanner;

public class JustEatIt {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        while (testCase-- > 0) {
            int n = scan.nextInt();
            int[] arra = new int[n];
            long u = 0;
            boolean ch = false;
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                arra[i] = in;
                u += in;
                if (u <= 0) {
                    ch = true;
                }
            }
            if (ch) {
                System.out.println("NO");
            } else {
                long p = 0;
                for (int i = n - 1; i >= 0; i--) {
                    p += arra[i];
                    if (p <= 0) {              
                        ch = true;
                    }
                }
                if (ch) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }

        }

    }

}
