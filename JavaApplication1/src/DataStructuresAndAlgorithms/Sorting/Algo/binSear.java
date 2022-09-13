package DataStructuresAndAlgorithms.Sorting.Algo;

public class binSear {

    static void in(binSirNode n, int d) {
        while (n.left != null && n.rigth != null) {
            if (d > n.data) {
                n = n.rigth;
            } else {
                n = n.left;
            }
        }
        if (n.data < d) {
            n.rigth = new binSirNode(d);
        } else {
            n.left = new binSirNode(d);
        }
    }

    static void p(binSirNode n) {
        if (n == null) {
            return;
        }
        p(n.left);
        System.out.println(n.data);
        p(n.rigth);
    }

    static boolean ch(binSirNode n, int c) {
        boolean t = false;
        while (n != null) {
            if (n.data == c) {
                t = true;
            }
            if (n.data > c) {
                n = n.left;
            } else {
                n = n.rigth;
            }
        }
        return t;
    }

    public static void main(String args[]) {
        binSirNode n = new binSirNode(56);
        n.root = n;
        in(n, 96);
        in(n, 5);
        in(n, 8);
        p(n);
        System.out.println(ch(n, 56));
    }

}
