package problemSolving6;

import java.util.Arrays;
import java.util.Scanner;

public class SnakeEating {

    static int lower(int[] ages, int target) {
        if (ages == null || ages.length == 0) {
            return 0;
        }
        int l = 0;
        int r = ages.length - 1;
        if (target <= ages[0]) {
            return 0;
        }
        if (target > ages[r]) {
            return -1;
        }
        while (l < r) {
            int m = l + (r - l) / 2;

            if (ages[m] >= target) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return r;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int q = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            long[] sum = new long[n + 1];
            sum[n - 1] = a[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                sum[i] = sum[i + 1] + a[i];
            }

            while (q-- > 0) {
                int x = scan.nextInt();
                int l = lower(a, x);
                if (l < 0) {
                    l = n;
                }
                int start = 0;
                int end = l - 1;
                
                while (start <= end) {
                    int mid = start + (end - start) / 2;
                 
                    int var = (x - mid) * x;
                    long predicate = var - (sum[mid] - sum[l]);
                    if (mid >= predicate) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
                System.out.println(n-start);
            }
            
        }
    }
}


