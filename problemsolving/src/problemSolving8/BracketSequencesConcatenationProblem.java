package problemSolving8;

import java.util.Scanner;
import java.util.Stack;

public class BracketSequencesConcatenationProblem {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.next();
        }
        int reg = 0;
        k:
        for (int i = 0; i < n; i++) {
            Stack<Integer> st = new Stack<Integer>();
            for (int j = 0; j < a[i].length(); j++) {
                if (a[i].charAt(j) == '(') {
                    st.add(1);
                } else {
                    if (st.isEmpty()) {

                        continue k;
                    }
                    st.pop();
                }

            }
            if (st.isEmpty()) {

                ++reg;
            }

        }
        int[] left = new int[300002];
        int[] right = new int[300002];
        long res = 0;
        for (int i = 0; i < n; i++) {
            Stack<Integer> st = new Stack<Integer>();
            int l = 0;
            int r = 0;
            for (int j = 0; j < a[i].length(); j++) {
                if (a[i].charAt(j) == '(') {
                    st.add(1);
                } else {
                    if (st.isEmpty()) {
                        ++l;
                    } else {
                        st.pop();
                    }
                }
            }
            r = st.size();
            if (l != 0 && r != 0) {
                continue;
            } else {
                if (l != 0) {
                    res += left[l];
                    ++right[l];
                } else if (r != 0) {
                    res += right[r];
                    ++left[r];
                }
            }
        }

        long r = 0;
        long k = 2;
        for (int i = 0; i < reg - 1; i++) {
            r += k;
            k += 2;
        }
        System.out.println(res + r + reg);

    }
}
