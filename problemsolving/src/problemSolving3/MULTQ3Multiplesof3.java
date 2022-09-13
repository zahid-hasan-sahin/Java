package problemSolving3;

import java.util.Scanner;

public class MULTQ3Multiplesof3 {

    public static void div(int[] arra, int[] seg, int node, int l, int r) {
        if (l == r) {
            seg[node] = arra[l];
            return;
        }
        int left = 2 * node;
        int right = (2 * node) + 1;
        int mid = (l + r) / 2;
        div(arra, seg, left, l, mid);
        div(arra, seg, right, mid + 1, r);
        seg[node] = seg[left] + seg[right];
    }

    public static int get(int[] arra, int[] seg, int node, int l, int r, int i, int j) {
        if (i <= l && r <= j) {
            return seg[node];
        } else if (i > r || j < l) {
            return 0;
        }
        int left = 2 * node;
        int rigth = 2 * node + 1;
        int mid = (l + r) / 2;
        int le = get(arra, seg, left, l, mid, i, j);
        int ri = get(arra, seg, rigth, mid + 1, r, i, j);
        return le + ri;

    }

    public static void up(int[] arra, int[] seg, int node, int l, int r, int i, int val) {
        if (l >= i && r <= i) {
            seg[node] = val;
            return;
        } else if (i > r || i < l) {
            return;
        }
        int left = node * 2;
        int right = node * 2 + 1;
        int mid = (l + r) / 2;
        up(arra, seg, left, l, mid, i, val);
        up(arra, seg, right, mid + 1, r, i, val);
        seg[node] = seg[left] + seg[right];
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = scan.nextInt();
        int arra[] = new int[++n];
        int[] seg = new int[n * 3];
        while (t-- > 0) {
            int p = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (p == 0) {
                for (int i = ++a; i <= b; i++) {
                    up(arra, seg, 0, 0, n, i, 1);
                }
            }else{
                
            }
        }
    }

}
