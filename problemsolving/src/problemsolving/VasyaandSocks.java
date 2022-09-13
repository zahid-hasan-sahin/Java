package problemsolving;

import java.util.Scanner;

public class VasyaandSocks {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int res = 0;
        int ns = 1;
        for (int i = 1; i <= n; i++) {
            if (m * ns == i) {
                ++n;
                ++ns;
            }
        }
        System.out.println(n);
    }
}
