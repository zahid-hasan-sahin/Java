package lightOj;

import java.util.Scanner;

public class Hexabonacci_1006 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int co = 0;
        long arr[] = new long[10005];
        while (co++ < t) {
            int n;
            arr[0] = scan.nextInt();
            arr[1] = scan.nextInt();
            arr[2] = scan.nextInt();
            arr[3] = scan.nextInt();
            arr[4] = scan.nextInt();
            arr[5] = scan.nextInt();
            n = scan.nextInt();
            for (int i = 6; i <= n; i++) {
                arr[i] = ((arr[i - 1] % 10000007) + (arr[i - 2] % 10000007) + (arr[i - 3] % 10000007) + (arr[i - 4] % 10000007) + (arr[i - 5] % 10000007) + (arr[i - 6] % 10000007)) % 10000007;
            }
            System.out.println("Case " + co + ": " + (arr[n] %10000007));

        }
    }
}
