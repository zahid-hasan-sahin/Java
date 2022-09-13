
import java.util.ArrayList;
import java.util.Scanner;

class Main {

    static int fn(String A, int n, int k, char ch) {
        int m = 1;
        int c = 0;
        int l = 0, r = 0;
        while (r < n) {
            if (A.charAt(r) != ch) {
                ++c;
            }
            while (c > k) {
                if (A.charAt(l) != ch) {
                    --c;
                }
                ++l;
            }
            m = Math.max(m, r - l + 1);

            ++r;
        }
        return m;
    }

    static int f(String A, int n, int k, char ch, int p) {

        int res = 0;
        int c = 0;
        int l = 0, r = 0;
        while (r < n) {
            if (A.charAt(r) != ch) {
                ++c;
            }
            while (c > k) {
                if (A.charAt(l) != ch) {
                    --c;
                }
                ++l;
            }

            int re = r - l + 1;
            if (re == p) {
                ++res;
            }
            ++r;
        }
        return res;
    }

    static int c(String A, int n, int k, int p) {
        int m = 1;
        m = Math.max(m, f(A, n, k, (char) ('+'), p));
        return m;
    }

    static int a(String A, int n, int k) {
        int m = 1;
        m = Math.max(m, fn(A, n, k, (char) ('+')));
        return m;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        String s = scan.next();
        int res = a(s, n, m);
        int r = c(s, n, m, res);
        System.out.println(res + " " + r);
    }
}
