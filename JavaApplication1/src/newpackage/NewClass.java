package newpackage;

public class NewClass {

    public static class seg {

        int prop;
        int val;
        int sum;

        public void add(int v) {
            val = v;
        }

    }
    static int[] arra = new int[8];
    NewClass b = new NewClass();
    static NewClass.seg ob[] = new NewClass.seg[8 * 3];

    public static void div(int node, int l, int r) {

        if (l == r) {
            ob[node].val = arra[l];
            return;
        }
        int left = 2 * node;
        int right = (2 * node) + 1;
        int mid = (l + r) / 2;
        div(left, l, mid);
        div(right, mid + 1, r);
        ob[node].val = ob[left].val + ob[right].val;
    }

    public static void update(int node, int l, int r, int i, int j, int x) {
        if (i <= l && r <= j) {
            ob[node].sum = ob[node].val + ((r - l) + 1) * x;
            ob[node].prop = ob[node].prop + x;
            return;
        } else if (i > r || j < l) {
            return;
        }
        int left = node * 2;
        int right = node * 2 + 1;
        int mid = (l + r) / 2;
        update(left, l, mid, i, j, x);
        update(right, mid + 1, r, j, j, x);
        ob[node].val = ob[left].val + ob[right].val + (((r - l) + 1) * ob[node].prop);
    }

    public static int get(int node, int l, int r, int i, int j, int carry) {
        if (i <= l && r <= j) {
            return ob[node].val + (carry * ((r - l) + 1)) + ob[node].prop;
        } else if (i > r || j < l) {
            return 0;
        }
        int left = node * 2;
        int right = node * 2 + 1;
        int mid = (l + r) / 2;
        int le = get(left, l, mid, i, j, carry + ob[node].prop);
        int ri = get(right, mid + 1, r, i, j, carry + ob[node].prop);
        return le + ri;
    }

    public static void main(String args[]) {
        arra[1] = 4;
        arra[2] = -9;
        arra[3] = 3;
        arra[4] = 7;
        arra[5] = 1;
        arra[6] = 0;
        arra[7] = 2;

        for (int i = 0; i < ob.length; i++) {
            ob[i] = new seg();
        }
        div(1, 1, 7);
        update(1, 1, 7, 1, 4, 2);
        System.out.println(get(1, 1, 7, 1, 3, 0));
    }
}
