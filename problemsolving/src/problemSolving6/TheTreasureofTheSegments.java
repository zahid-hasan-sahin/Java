package problemSolving6;

import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;

public class TheTreasureofTheSegments {

    static int up(Integer[] a, int x) {
        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] <= x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l - 1;
    }

    static int s(Integer[] arr, int target) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] >= target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    static int low(Integer[] a, int x) {
        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            int mid = (l + r);
            if (a[mid] >= x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return r + 1;
    }

    public static void main(String args[]) {
        Reader scan = new Reader();

        PrintWriter out = new PrintWriter(System.out);

        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            Integer[] l = new Integer[n];
            Integer[] r = new Integer[n];
            Integer[] a = new Integer[n];
            Integer[] b = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                b[i] = scan.nextInt();
                l[i] = a[i];
                r[i] = b[i];
            }
            Arrays.sort(l);
            Arrays.sort(r);
            int mx = 1000000000;
            for (int i = 0; i < n; i++) {
                int x = s(r, a[i]);
                int y = s(l, b[i] + 1);
                y = Math.max(n - y, 0);
                mx = Math.min(x + y, mx);
            }
            out.println(mx);
        }
        out.close();
    }

    public static class Reader {

        BufferedReader br;
        StringTokenizer st;

        public Reader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }

}
