package ProblemSolving5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;

public class RecursiveQueries {

    static int f(int n) {
        String s = String.valueOf(n);
        int res = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                res *= (s.charAt(i) - '0');
            }
        }
        return res;
    }

    static int g(int n) {
        if (n < 10) {
            return n;
        }
        return g(f(n));
    }

    public static void main(String args[]) {
        Reader scan = new Reader();
        int[] a = new int[1000010];
        for (int i = 0; i < 1000010; i++) {
            a[i] = g(i);
        }
        int[][] res = new int[10][1000010];
        for (int i = 1; i <= 9; i++) {
            int k = 0;
            for (int j = 0; j < 1000010; j++) {
                if (a[j] == i) {
                    ++k;
                }
                res[i][j] = k;
            }
        }
        StringBuilder sb = new StringBuilder();

        int t = scan.nextInt();
        while (t-- > 0) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            int p = scan.nextInt();
            sb.append(res[p][r] - res[p][l - 1] + "\n");
        }
        System.out.println(sb);

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
