package problemSolving6;

import java.util.Scanner;

public class GamewithelephoneNumbers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        int k = n - 11;
        k /= 2;
        int p = 0;
        for (int i = 0; i <= n - 11; i++) {
            if (s.charAt(i) == '8') {
                ++p;
            }
        }
        if (p > k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
