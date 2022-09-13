package ProblemSolving7;

import java.util.Scanner;
import java.util.Stack;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class SimpleTextEditor {

    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        char[] s = new char[1000010];
        int p = 0;
        Stack<String> st = new Stack<String>();
        Stack<StringBuilder> del = new Stack<StringBuilder>();
        StringBuilder res = new StringBuilder();

        while (q-- > 0) {
            int n = scan.nextInt();
            if (n == 1) {
                String in = scan.next();
                for (int i = 0; i < in.length(); i++) {
                    s[p + i] = in.charAt(i);
                }
                p += in.length();
                String r = n + " " + in;
                st.add(r);
            } else if (n == 2) {
                int k = scan.nextInt();
                StringBuilder sb = new StringBuilder();
                for (int i = p - k; i < p; i++) {
                    sb.append(s[i]);
                }
                del.add(sb);
                p -= k;
                String r = n + " " + k;
                st.add(r);
            } else if (n == 3) {
                int k = scan.nextInt();
                res.append(s[k - 1] + "\n");
            } else {
                String r = st.pop();
                if (r.charAt(0) == '1') {
                    p -= r.length() - 2;
                } else {
                    StringBuilder sb = new StringBuilder(del.pop());
                    for (int i = 0; i < sb.length(); i++) {
                        s[p + i] = sb.charAt(i);
                    }
                    p += sb.length();

                }
            }

        }
        System.out.println(res);
    }
}
