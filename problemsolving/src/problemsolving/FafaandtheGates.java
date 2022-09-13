package problemsolving;

import java.util.Scanner;

public class FafaandtheGates {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String move = scan.next();
        int r = 0;
        int u = 0;
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            if (move.charAt(i) == 'R') {
                ++r;
            } else {
                ++u;
            }
            if (r == u && move.charAt(i + 1) == move.charAt(i)) {
                ++count;
            }
        }
        System.out.println(count);

    }
}
