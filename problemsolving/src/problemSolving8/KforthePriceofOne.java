package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KforthePriceofOne {

    static boolean check(ArrayList<Integer> a, int val, int p, int k) {
        long sum = 0;
        while (val - k >= 0) {
            sum += a.get(val - 1);
            val -= k;
        }

        for (int i = 0; i < val; i++) {
            sum += a.get(i);
        }
        return sum <= p;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int p = scan.nextInt();
            int k = scan.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                a.add(scan.nextInt());
            }
            Collections.sort(a);
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for (int i = 0; i <= n; i += k) {
                ar.add(i);
            }
            int l = 0;
            int r = ar.size() - 1;
            int res = 0;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (check(a, ar.get(mid), p, k)) {
                    l = mid + 1;
                    res = Math.max(res, mid);
                } else {
                    r = mid - 1;
                }
            }
            ar.add(n);
            
            l = ar.get(res);
            r = ar.get(res + 1);

            int res2 = 0;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (check(a, mid, p, k)) {
                    l = mid + 1;
                    res2 = Math.max(res2, mid);
                } else {
                    r = mid - 1;
                }
            }
            System.out.println(res2);

        }

    }

}
