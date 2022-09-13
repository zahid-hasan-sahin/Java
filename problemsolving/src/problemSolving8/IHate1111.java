package problemSolving8;

import java.util.Scanner;

public class IHate1111 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            if (n > 1099) {
                System.out.println("YES");
                continue;
            }
            for (int i = 0; i < 110; i++) {
                for (int j = 0; j < 15; j++) {
                    if (i * 11 + 111 * j == n) {
                        System.out.println("YES");
                        continue k;
                    }
                }
            }
            System.out.println("NO");
        }

    }
}
