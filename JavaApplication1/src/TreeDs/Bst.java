package TreeDs;

public class Bst {

    Node root;

    class Node {

        int key;
        Node left, right;

        Node(int k) {
            key = k;
        }
    }

    public void insert(int key) {
        root = makeTree(root, key);

    }

    public Node makeTree(Node n, int k) {
        if (n == null) {
            Node nd = new Node(k);
            n = nd;
            return n;
        }
        if (n.key < k) {
            n.right = makeTree(n.right, k);
        } else {
            n.left = makeTree(n.left, k);
        }
        return n;
    }

    public void inOrder(Node r) {
        if (r == null) {
            return;
        }
        inOrder(r.left);
        System.out.println(r.key);
        inOrder(r.right);
    }

    public Node searching(Node r, int k) {
        if (r.key == k) {
            return r;
        }
        if (r == null) {
            return null;
        }

        if (k < r.key) {
            if (r.left == null) {
                return null;
            }
            return searching(r.left, k);
        } else {
            if (r.right == null) {
                return null;
            }
            return searching(r.right, k);
        }
    }

    void searchWithoutReq(Node r, int k) {

        int flag = 0;
        while (true) {
            if (r.key == k) {
                flag = 1;
                break;
            }
            if (r.key < k) {
                r = r.right;
            } else {
                r = r.left;
            }
            if (r == null) {
                break;
            }
        }
        if (flag == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    Node findMin(Node r) {
        if (r.left == null) {
            return r;
        }
        return findMin(r.left);
    }

    Node findMax(Node r) {
        if (r.right == null) {
            return r;
        }
        return findMax(r.right);
    }

    static int findMinValueWithoutReq(Node n) {
        while (true) {
            if (n.left == null) {
                return n.key;
            }
            n = n.left;
        }
    }

    void deleteKey(int key) {
        root = delete(root, key);
    }

    Node delete(Node r, int k) {
        Bst bs = new Bst();
        if (r == null) {
            return root;
        }
        if (r.key > k) {
            r.left = delete(r.left, k);
        } else if (r.key < k) {
            r.right = delete(r.right, k);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.key = findMinValueWithoutReq(root.right);
            root.right = delete(root.right, root.key);
        }
        return r;
    }

    int checkIsBst(Node r, int min, int max) {
        if (r == null) {
            return 1;
        }
        if (r.key > min && r.key < max && (checkIsBst(r.left, min, r.key) == 1) && (checkIsBst(r.right, r.key, max) == 1)) {
            return 1;
        }
        return 0;
    }

    Node makeSortedArrayToBn(int[] arr, int l, int r) {
        if (l > r) {
            return null;
        }
        int mid = (l + r) / 2;
        Node nd = new Node(arr[mid]);
        nd.left = makeSortedArrayToBn(arr, l, mid - 1);
        nd.right = makeSortedArrayToBn(arr, mid + 1, r);
        return nd;
    }

    void preOrder(Node r) {
        if (r == null) {
            return;
        }
        System.out.println(r.key);
        preOrder(r.left);
        preOrder(r.right);
    }

    Node findFirstAncestor(Node r, int a, int b) {
        if (r == null) {
            return null;
        }
        if (r.key > a && r.key > b) {
            return findFirstAncestor(r.left, a, b);
        }
        if (r.key < a && r.key < b) {
            return findFirstAncestor(r.right, a, b);
        }
        return r;
    }

    int isOneNode(Node r) {
        if (r.left != null && r.right != null) {
            return 0;
        }
        if (r.left != null) {
            isOneNode(r.left);
        }
        if (r.right != null) {
            isOneNode(r.right);
        }
        return 1;
    }

    public static void main(String args[]) {
        Bst tree = new Bst();
        tree.insert(8);
        tree.insert(3);
        tree.insert(5);
        tree.insert(7);
        tree.insert(9);
        System.out.println(tree.isOneNode(tree.root));
    }

}
