package problemSolving8;

import java.util.Scanner;

public class DistinctCharactersQueries {

    static boolean isSet(int bit, int ind) {
        if ((bit & 1 << ind) != 0) {
            return true;
        }
        return false;
    }

    static int setBit(int bit, int ind) {
        bit = bit | 1 << ind;
        return bit;
    }

    static void buildSeg(char[] a, int[] tree, int sIndex, int sStart, int sEnd) {
        if (sStart == sEnd) {
            tree[sIndex] = setBit(0, a[sStart] - 'a');
            return;
        }
        int m = (sStart + sEnd) / 2;
        buildSeg(a, tree, sIndex * 2, sStart, m);
        buildSeg(a, tree, sIndex * 2 + 1, m + 1, sEnd);
        tree[sIndex] = tree[sIndex * 2] | tree[sIndex * 2 + 1];
    }

    static int query(int[] tree, int sIndex, int sStart, int sEnd, int qStart, int qEnd) {
        if (qEnd < sStart || qStart > sEnd) {
            return 0;
        }
        if (sStart >= qStart && sEnd <= qEnd) {
            return tree[sIndex];
        }
        int mid = (sStart + sEnd) / 2;
        int x = query(tree, 2 * sIndex, sStart, mid, qStart, qEnd);
        int y = query(tree, 2 * sIndex + 1, mid + 1, sEnd, qStart, qEnd);
        return x | y;
    }

    static void updatePoint(int[] tree, int sIndex, int sStart, int sEnd, int q, char val) {
        if (sStart == sEnd) {
            tree[sIndex] = setBit(0, val - 'a');
            return;
        }
        int m = (sStart + sEnd) / 2;
        if (q <= m) {
            updatePoint(tree, sIndex * 2, sStart, m, q, val);
        } else {
            updatePoint(tree, sIndex * 2 + 1, m + 1, sEnd, q, val);
        }
        tree[sIndex] = tree[sIndex * 2] | tree[sIndex * 2 + 1];
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int n = s.length();
        int q = scan.nextInt();
        int[] tree = new int[n * 4];
        char[] a = s.toCharArray();
        buildSeg(a, tree, 1, 0, n - 1);

        while (q-- > 0) {
            int c = scan.nextInt();
            int l = scan.nextInt();
            if (c == 1) {
                char r = scan.next().charAt(0);
                updatePoint(tree, 1, 0, n - 1, l - 1, r);
            } else {
                int r = scan.nextInt();
                int res = query(tree, 1, 0, n - 1, l - 1, r - 1);
                int ans = 0;
                for (int i = 0; i < 26; i++) {
                    if (isSet(res, i)) {
                        ++ans;
                    }
                }

                System.out.println(ans);
            }

        }
    }
}
