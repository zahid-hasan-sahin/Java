package problemSolving3;

import java.util.Scanner;

public class Carousel {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] arra = new int[n];
            arra[0] = scan.nextInt();
            int a = -1;
            int c = 0;
            int r = 1;
            for (int i = 1; i < n; i++) {
                arra[i] = scan.nextInt();
                if (arra[i] == arra[i - 1]) {
                    a = i;
                    ++c;
                }
            }
            if (arra[0] == arra[n - 1]) {
                a = 0;
                ++c;
            }
            if (c == n) {
                System.out.println(1);
                for (int i = 0; i < n; i++) {
                   System.out.print(1 + " ");
                }
            } else if (a >= 0) {
                int[] res = new int[n];
                System.out.println(2);
                for (int i = a; i < n + a; i++) {
                    res[i % n] = r;
                    ++r;
                    if (r > 2) {
                        r = 1;
                    }
                }
                for (int i = 0; i < n; i++) {
                   System.out.print(res[i] + " ");
                }
            } else {
                if (n % 2 == 0) {
                   System.out.println(2 );
                    for (int i = 0; i < n; i++) {
                        System.out.print(r + " ");
                        ++r;

                        if (r > 2) {
                            r = 1;
                        }
                    }

                } else {
                    System.out.println(3);

                    for (int i = 0; i < n; i++) {
                        if (n % 3 != 0 && i == 1) {
                            r = 3;

                        }
                        System.out.print(r + " ");
                        ++r;

                        if (r > 3) {
                            r = 1;
                        }
                    }
                }

            }
            System.out.println();
        }

        
    }

}
