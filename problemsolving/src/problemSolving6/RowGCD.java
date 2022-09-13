package problemSolving6;

import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;

public class RowGCD {

    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String args[]) {
        Reader scan = new Reader();
        PrintWriter out = new PrintWriter(System.out);
        Integer n = scan.nextInt();
        Integer m = scan.nextInt();
        long gcd = 0;
        Long[] a = new Long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextLong();

        }
        Arrays.sort(a);
        for (int i = 1; i < n; i++) {
            gcd = gcd(gcd, a[i] - a[0]);
        }
        for (int i = 0; i < m; i++) {
            long in = scan.nextLong();
            out.print(gcd(a[0] + in, gcd) + " ");
        }
        out.println();
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
