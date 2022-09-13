package problemSolving8;

import java.util.Scanner;

public class LuntikandConcerts {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long a = scan.nextLong();
            long b = 2 * scan.nextLong();
            long c = 3 * scan.nextLong();
            long sum = (a + b + c);
            System.out.println(sum % 2);

        }

    }

}
