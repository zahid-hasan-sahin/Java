package NumberTheory;

public class BinaryTree {

    static int height(Node root, int h) {

        if (root.left == null && root.right == null) {
            return h;
        }
        int x = 0;
        int y = 0;
        if (root.left != null) {
            x = height(root.left, h + 1);
        }
        if (root.right != null) {
            y = height(root.right, h + 1);
        }
        return Math.max(x, y);

    }

    static int level(Node root, int key, int h) {
        if (root.data == key) {
            return h;
        }
        int x = -1;
        int y = -1;
        if (root.left != null) {
            x = level(root.left, key, h + 1);
        }

        if (root.right != null) {

            y = level(root.right, key, h + 1);
        }
        if (x == -1 && y == -1) {
            return -1;
        } else {
            return Math.max(x, y);
        }
    }

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int d, Node l, Node r) {
            data = d;
            left = l;
            right = r;

        }
    }

    static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    static boolean isSame(Node root1, Node root2) {

        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.data != root2.data) {
            return false;
        }
        if (!isSame(root1.left, root2.left)) {
            return false;
        }
        if (!isSame(root1.right, root2.right)) {
            return false;
        }

        return true;
    }

    static Node copy(Node root) {
        if (root == null) {
            return null;
        }
        Node ob = new Node(root.data, null, null);
        ob.left = copy(root.left);
        ob.right = copy(root.right);
        return ob;
    }

    public static void main(String[] args) {
        Node root = new Node(0, null, null);
        Node one = new Node(1, null, null);
        Node two = new Node(2, null, null);
        Node three = new Node(3, null, null);
        Node four = new Node(4, null, null);
        Node five = new Node(5, null, null);

        root.left = one;
        root.right = two;
        two.left = three;
        two.right = four;
        four.right = five;

        System.out.println(height(root, 0));
        System.out.println(level(root, 5, 1));
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        
        Node root1 = new Node(0, null, null);
        Node one1 = new Node(1, null, null);
        Node two1 = new Node(2, null, null);
        Node three1 = new Node(3, null, null);
        Node four1 = new Node(4, null, null);
        Node five1 = new Node(5, null, null);

        root1.left = one1;
        root1.right = two1;
        two1.left = three1;
        two1.right = four1;
        four1.right = five1;

        Node root2 = new Node(0, null, null);
        Node one2 = new Node(1, null, null);
        Node two2 = new Node(2, null, null);
        Node three2 = new Node(3, null, null);
        Node four2 = new Node(4, null, null);
        Node five2 = new Node(5, null, null);

        root2.left = one2;
        root2.right = two2;
        two2.left = three2;
        two2.right = four2;
        //   four2.right = five2;
        System.out.println(isSame(root, root1));
        System.out.println(isSame(root, root2));

        Node ob = copy(root);
        preOrder(ob);
    }
}
