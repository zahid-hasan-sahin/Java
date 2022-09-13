package ProblemSolving7;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.StringTokenizer;

public class SiblingsandLegoBlocks {

    public static void main(String args[]) throws IOException {
        FastReader scan = new FastReader();
        StringBuilder sb = new StringBuilder();
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            ArrayList<String> a = new ArrayList<String>();
            for (int i = 0; i < n; i++) {
                String s = scan.next();
                int in = scan.nextInt() - 1;
                if (a.size() >= in) {
                    a.add(in, s);
                }
            }
            int m = scan.nextInt();
            for (int i = 0; i < m; i++) {
                String p = scan.next();
                for (int j = 0; j < n; j++) {
                    a.remove(p);
                }
            }
            if (a.size() == 0) {
                sb.append("-1\n");
            } else {
                for (int i = 0; i < a.size(); i++) {
                    sb.append(a.get(i) + "\n");
                }
            }
        }
        System.out.println(sb.delete(sb.length() - 1, sb.length()));
    }

    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
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

    }

}
