package problemSolving8;

import java.util.Scanner;

public class PythagoreanTriples {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long n = scan.nextInt();
            long l = 0;
            long r = 1000000000;
            long res = 0;
            while (l <= r) {
                long mid = (l + r) / 2;
                long sum = ((mid * (mid + 1)) / 2) * 4;

                if (sum <= n - 1) {
                    res = mid;
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            System.out.println(res);
        }

    }
}
