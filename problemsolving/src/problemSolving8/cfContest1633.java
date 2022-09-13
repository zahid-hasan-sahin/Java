package problemSolving8;

import java.util.Scanner;

public class cfContest1633 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            long ch = scan.nextLong();
            long ca = scan.nextLong();

            long mh = scan.nextLong();
            long ma = scan.nextLong();
            long c = scan.nextLong();

            long x = scan.nextLong();
            long y = scan.nextLong();
            for (int i = 0; i <= c; i++) {
                long cr = ch + (i * y);
                long cl = ca + ((c - i) * x);

                if (Math.ceil(cr / (double) ma) >= Math.ceil(mh / (double) cl)) {
                    System.out.println("YES");
                    continue k;
                }
            }
            System.out.println("NO");
        }

    }

}
