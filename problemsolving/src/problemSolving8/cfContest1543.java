package problemSolving8;

import java.util.Scanner;

public class cfContest1543 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            long s = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                s += a[i];
            }
            long r = (s % n);
            r = r * (n - r);
            System.out.println(r);
        }
    }
}
