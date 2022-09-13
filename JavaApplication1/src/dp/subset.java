package dp;

import java.util.Scanner;
import java.util.Stack;

public class subset {

    static Stack<Integer> st = new Stack<Integer>();

    static int off(int n, int k) {
        if (k <= 0) {
            return n;
        }
        return (n & ~(1 << (k - 1)));
    }

    static int set(int n, int k) {

        return ((1 << k) | n);
    }

    public static boolean isSet(int n,
            int k) {
        if ((n & (1 << (k - 1))) > 0) {
            return true;
        } else {
            return false;
        }
    }

    static void subSet(int[] a, int i, int p) {
        if (a.length <= i) {

            return;
        }
        subSet(a, i + 1, p);
        p = set(p, i);

        subSet(a, i + 1, p);
        p = off(p, i);
    }
//    
//     static void subSet(int[] a, int i, int p) {
//        if (a.length <= i) {
//            System.out.println(st);
//            return;
//        }
//        st.add(a[i]);
//        subSet(a, i + 1, p);
//        st.pop();
//        subSet(a, i + 1, p);
//
//    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] a = {1, 2, 3};
        subSet(a, 0, 0);
    }

}
