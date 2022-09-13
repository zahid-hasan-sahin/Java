package problemSolving8;

import java.util.Scanner;

public class EhabtheXorcist {

    static long setBit(long num, long pos) {
        return num |= 1 << pos;
    }

    static boolean rec(long a, long b, int pos, long u, long v) {

        if (((a ^ b) == u) && (a + b == v)) {
            return true;
        }
        if (pos >= 15) {
            return false;
        }
        boolean res = false;
        if (!res) {
            res = rec(setBit(a, pos), b, pos + 1, u, v);
        }
        if (!res) {
            res = rec(setBit(a, pos), setBit(b, pos), pos + 1, u, v);
        }
        if (!res) {
            res = rec(a, setBit(b, pos), pos + 1, u, v);
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long u = scan.nextLong();
        long v = scan.nextLong();
        boolean b = rec(0, 0, 0, u, v);
        System.out.println(b);

    }

}
