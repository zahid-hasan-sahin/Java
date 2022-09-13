package ProblemSolving5;

class Node {

    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree {

    //Root of Binary Tree
    Node root;

    BinaryTree() {
        root = null;
    }

    /*Given a binary tree, print its nodes accor "bottop-up" postorder traversal. */
    void printPostOrder(Node node) {

        if (node == null) {
            return;
        }

        //first recur on left subtree
        printPostOrder(node.left);

        //then recur on right subtree
        printPostOrder(node.right);

        // now deal with the node
        System.out.print(node.key + " ");
    }

    /* Given a binary tree, print its nodes in in order*/
    void printInorder(Node node) {
        if (node == null) {
            return;
        }

        /* first print data of node */
        System.out.print(node.key + " ");

        /* then recur on left sutree */
        printInorder(node.left);

        /* now recur on right subtree */
        printInorder(node.right);
    }
    // Driver method

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is ");
        tree.printPostOrder(tree.root);

    }
}
