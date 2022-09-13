package dp;


import java.util.Scanner;
import java.util.Stack;

public class MaximumRectangularAreainaHistogram {

    public static void main(String args[])  {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            Integer[] a = new Integer[n + 2];
            a[0] = a[n + 1] = 0;
            for (int i = 1; i <= n; i++) {
                a[i] = scan.nextInt();
            }
            Stack<Integer> st = new Stack<Integer>();
            st.add(0);
            long res = 0;
            for (int i = 1; i <= n + 1; i++) {
                if (a[st.peek()] <= a[i]) {
                    st.add(i);
                } else {
                    while (a[st.peek()] > a[i]) {
                        int y = st.pop();
                        int r = st.peek();
                        res = Math.max(a[y] * (i - r - 1), res);
                    }
                    st.add(i);

                }

            }

            System.out.println(res);
        }

    }

}
