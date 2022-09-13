package problemSolving6;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Integer[] a = new Integer[26];
        Integer[] pos = new Integer[26];
        Integer k = 0;
        Integer p = 2;
        for (int i = 0; i < 22; i++) {
            if (p == 7) {
                a[i] = a[i + 1] = a[i + 2] = 7;
                pos[i] = 2;

                pos[i + 1] = 3;
                pos[i + 2] = 4;

                i += 2;
                k = 0;
                p = 8;
                continue;
            }
            if (k == 3) {
                k = 0;
                ++p;
            }
            a[i] = p;
            pos[i] = k + 1;
            ++k;
        }
        a[22] = a[23] = a[24] = a[25] = 9;
        pos[22] = 1;
        pos[23] = 2;
        pos[24] = 3;
        pos[25] = 4;
        StringBuilder sb = new StringBuilder();
        Integer[] c = new Integer[10];
        Integer[] r = new Integer[10];
        c[2] = c[3] = 1;
        c[4] = c[5] = c[6] = 2;
        c[7] = c[8] = c[9] = 3;

        r[4] = r[7] = 1;
        r[2] = r[5] = r[8] = 2;
        r[3] = r[6] = r[9] = 3;
        Integer[][] mat = new Integer[10][10];
        mat[1][2] = 2;
        mat[1][3] = 3;
        mat[2][1] = 4;
        mat[2][2] = 5;
        mat[2][3] = 6;
        mat[3][1] = 7;
        mat[3][2] = 8;
        mat[3][3] = 9;
        mat[1][1] = 5;
        while (t-- > 0) {
            String s = scan.next();
            int n = s.length();
            int b = a[s.charAt(0) - 'a'];
            int res = pos[s.charAt(0) - 'a'];
            StringBuilder w = new StringBuilder();
            for (int i = 0; i < pos[s.charAt(0) - 'a']; i++) {
                w.append(a[s.charAt(0) - 'a'] + " ");
            }

            for (int i = 1; i < n; i++) {
                int e = Math.abs(c[b] - c[a[s.charAt(i) - 'a']]) + Math.abs(r[b] - r[a[s.charAt(i) - 'a']]);
                res += Math.max(e - 1, 0);
                res += pos[s.charAt(i) - 'a'];
                boolean we = false;
                int ap = a[s.charAt(i) - 'a'];
                if (c[b] < c[ap]) {
                    for (int j = c[b] + 1; j < c[ap]; j++) {
                        w.append(mat[j][r[b]] + " ");

                    }
                    we = true;
                } else if (c[b] > c[ap]) {
                    for (int j = c[b] - 1; j > c[ap]; j--) {
                        w.append(mat[j][r[b]] + " ");
                    }
                    we = true;
                }
                c[b] = c[ap];
                if (r[b] < r[ap]) {
                    for (int j = r[b] + 1; j < r[ap]; j++) {
                        w.append(mat[c[b]][j] + " ");
                    }
                    if (we) {
                        w.append(mat[c[b]][r[b]] + " ");
                    }
                } else if (r[b] > r[ap]) {
                    for (int j = r[b] - 1; j > r[ap]; j--) {
                        w.append(mat[c[b]][j]);
                    }
                    if (we) {
                        w.append(mat[c[b]][r[b]] + " ");
                    }
                }
                int er = s.charAt(i) - 'a';
                for (int j = 0; j < pos[er]; j++) {
                    w.append(ap + " ");
                }
                b = a[s.charAt(i) - 'a'];

            }
            sb.append(res + "\n" + w + "\n");
        }
        System.out.println(sb.delete(sb.length() - 1, sb.length()));

    }

}

class Scanner {

    public BufferedReader reader;
    public StringTokenizer st;

    public Scanner(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        st = null;
    }

    public String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                String line = reader.readLine();
                if (line == null) {
                    return null;
                }
                st = new StringTokenizer(line);
            } catch (Exception e) {
                throw (new RuntimeException());
            }
        }
        return st.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}

class OutputWriter {

    BufferedWriter writer;

    public OutputWriter(OutputStream stream) {
        writer = new BufferedWriter(new OutputStreamWriter(stream));
    }

    public void print(int i) throws IOException {
        writer.write(i);
    }

    public void print(String s) throws IOException {
        writer.write(s);
    }

    public void print(char[] c) throws IOException {
        writer.write(c);
    }

    public void close() throws IOException {
        writer.close();
    }

}
