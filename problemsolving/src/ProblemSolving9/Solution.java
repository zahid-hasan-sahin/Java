
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int q = 1;
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            System.out.print("Case #" + q++ + ": ");
            if (Math.ceil(n / 2.0) > k) {
                System.out.println("NO");
                continue k;
            }
            int[] f = new int[101];
            for (int i = 0; i < n; i++) {
                ++f[a[i]];
            }
            for (int i = 0; i < 101; i++) {
                if (f[i] >= 3) {
                    System.out.println("NO");
                    continue k;
                }
            }
            System.out.println("YES");
        }
    }
}
