package ProblemSolving7;

import java.util.Scanner;
import java.util.Stack;

public class maximumHistogram {

    public static long getMaxArea(long a[], long n) {
        Stack<Integer> st = new Stack<Integer>();
        st.add(0);
        long res = 0;
        for (int i = 1; i <= n + 1; i++) {
            if (a[st.peek()] <= a[i]) {
                st.add(i);
            } else {
                while (a[st.peek()] > a[i]) {
                    int c = st.pop();
                    int l = st.peek();
                    res = Math.max(res, (i - l - 1) * a[c]);
                }
               
                st.add(i);
            }

        }
        return res;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] a = new long[n + 2];
        for (int i = 1; i <= n; i++) {
            a[i] = scan.nextInt();
        }
        a[0] = a[n + 1] = 0;
        long p = getMaxArea(a, n);
        System.out.println(p);
    }
}
