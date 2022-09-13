package newpackage;

public class segmentTree {

    static int arra[] = new int[8];
    static int[] seg = new int[7 * 3];

    public static void div(int node, int l, int r) {
        if (l == r) {
            seg[node] = arra[l];
            return; 
        }
        int left = 2 * node;
        int right = (2 * node) + 1;
        int mid = (l + r) / 2;
        div(left, l, mid);
        div(right, mid + 1, r);
        seg[node] = seg[left] + seg[right];
    }

    public static int get(int node, int l, int r, int i, int j) {
        if (i <= l && r <= j) {
            return seg[node];
        } else if (i > r || j < l) {
            return 0;
        }
        int left = 2 * node;
        int rigth = 2 * node + 1;
        int mid = (l + r) / 2;
        int le = get(left, l, mid, i, j);
        int ri = get(rigth, mid + 1, r, i, j);
        return le + ri;

    }

    public static void up(int node, int l, int r, int i, int val) {
        if (l >= i && r <= i) {
            seg[node] = val;
            return;
        } else if (i > r || i < l) {
            return;
        }
        int left = node * 2;
        int right = node * 2 + 1;
        int mid = (l + r) / 2;
        up(left, l, mid, i, val);
        up(right, mid + 1, r, i, val);
        seg[node] = seg[left] + seg[right];
    }

    public static void main(String args[]) {
        arra[1] = 4;
        arra[2] = -9;
        arra[3] = 3;
        arra[4] = 7;
        arra[5] = 1;
        arra[6] = 0;
        arra[7] = 2;
        div(1, 1, 7);
        for (int i = 0; i < seg.length; i++) {
            System.out.print(seg[i] +" ");
        }
    }

}
