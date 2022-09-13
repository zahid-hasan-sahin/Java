
import java.util.Scanner;

public class cfContest1554 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            long res = Long.MIN_VALUE;
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = Math.max(0, n - 101); i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    res = Math.max(res, (long) (i + 1) * (long) (j + 1) - k * (a[i] | a[j]));
                }
            }
            System.out.println(res);
        }

    }
}
