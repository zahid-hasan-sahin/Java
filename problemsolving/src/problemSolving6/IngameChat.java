package problemSolving6;

import java.util.Scanner;

public class IngameChat {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            int k = n - 1;
            while (k >= 0 && s.charAt(k) == ')') {
                --k;
            }
            int p = n - k - 1;
            if (n - p < p) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}
