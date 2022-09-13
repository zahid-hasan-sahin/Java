package DataStructuresAndAlgorithms.Sorting.Algo;

public class binaryTree {

    static void p(binNode n, int item) {
        if (n.left != null) {
            p(n.left, item);

        } else if (n.left == null && n.right != null) {
            n.left = new binNode(item);
            return;
        }
        if (n.right != null) {
            p(n.right, item);
        } else if (n.left != null && n.right == null) {
            n.right = new binNode(item);
            return;
        }
    }

    static void pr(binNode n) {
        if (n == null) {
            return;
        }

        pr(n.left);
        System.out.print(n.item + " ");
        pr(n.right);
    }

    public static void main(String args[]) {
        binNode t = new binNode(10);
        t.root = t;
        t.left = new binNode(11);
        t.right = new binNode(9);
        t.right.left = new binNode(15);

        System.out.print("Inorder traversal before insertion:");
        pr(t.root);

        int key = 12;
        p(t.root, key);

        System.out.print("\nInorder traversal after insertion:");
        pr(t.root);
    }

}
