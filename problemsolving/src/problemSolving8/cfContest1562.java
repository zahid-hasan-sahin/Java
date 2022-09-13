package problemSolving8;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class cfContest1562 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            for (int i = 0; i < n / 2; i++) {
                if (s.charAt(i) == '0') {
                    System.out.println((i + 1) + " " + n + " " + (i + 2) + " " + n);
                    continue k;
                }
            }
            for (int i = n / 2; i < n; i++) {
                if (s.charAt(i) == '0') {
                    System.out.println((1) + " " + (i + 1) + " " + (1) + " " + (i));
                    continue k;
                }
            }
            System.out.println(1 + " " + (n - 1) + " " + 2 + " " + n);
        }
    }
}
