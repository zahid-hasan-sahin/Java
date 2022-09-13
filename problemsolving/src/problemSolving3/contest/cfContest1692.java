
import java.util.*;

public class cfContest1692 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n];
            int[] pre = new int[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();

            }
            pre[1] = a[0];
            for (int i = 2; i <= n; i++) {
                pre[i] = pre[i - 1] + a[i - 1];
            }
            if (pre[n] < k) {
                System.out.println("-1");
            } else {
                int ans = Integer.MAX_VALUE;
                for (int i = 1; i <= n; i++) {

                    int x = k;
                    int l = i;
                    int r = n;
                    int res = -1;

                    while (l <= r) {
                        int mid = (l + r) / 2;

                        if (pre[mid] - pre[i - 1] == x) {
                            res = mid;
                            l = mid + 1;
                        } else if (pre[mid] - pre[i - 1] < x) {
                            l = mid + 1;
                        } else {
                            r = mid - 1;
                        }
                    }

                    if (res != -1) {
                        ans = Math.min(ans, (i - 1) + (n - res));
                    }
                }

                System.out.println(ans);
            }
        }
    }
}
