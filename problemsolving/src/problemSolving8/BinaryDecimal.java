package problemSolving8;

import java.util.Scanner;

public class BinaryDecimal {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int mx = 0;
            String s = scan.next();
            for (int i = 0; i < s.length(); i++) {
                mx = Math.max(s.charAt(i) - '0', mx);
            }
            System.out.println(mx);
        }
    }

}
