package TreeDs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Stream;

public class Test {

    public static Node root;

    class Node {

        int key;
        Node left, right, next;

        Node(int key) {
            this.key = key;
            left = right = next = null;
        }

        void d(Node n) {
            n = null;
        }
    }

    void insert(Node r, int key) {
        Test t = new Test();
        Queue<Node> ob = new LinkedList<Node>();
        ob.add(r);
        while (!ob.isEmpty()) {
            Node temp = ob.peek();
            ob.remove();
            if (temp.left == null) {
                temp.left = t.new Node(key);
                break;
            } else {
                ob.add(temp.left);
            }
            if (temp.right == null) {
                temp.right = t.new Node(key);
                break;
            } else {
                ob.add(temp.right);

            }
        }

    }

    Node findDeepest(Node r) {
        Test t = new Test();
        Queue<Node> n = new LinkedList<Node>();
        n.add(r);
        Node temp = r;
        while (!n.isEmpty()) {
            temp = n.peek();
            n.remove();
            if (temp.left != null) {
                n.add(temp.left);
            }
            if (temp.right != null) {
                n.add(temp.right);
            }
        }
        return temp;

    }

    void replace(Node r, int d) {
        Queue<Node> n = new LinkedList<Node>();
        Test te = new Test();
        Node rep = te.findDeepest(r);
        if (r.key == d) {
            Node newRep = te.new Node(rep.key);
            try {
                newRep.left = root.left;
            } catch (Exception e) {
            }
            try {
                newRep.right = root.right;
            } catch (Exception e) {
            }
            root = newRep;
            rep = null;

            System.out.println("\n" + rep + "\n");

            return;
        }
        n.add(r);
        Node temp = r;
        while (n.peek().key != d || n.peek().key != d) {
            temp = n.peek();
            n.remove();
            if (temp.left != null) {
                n.add(temp.left);
            }
            if (temp.right != null) {
                n.add(temp.right);
            }
        }

    }

    boolean isCon(Node n) {
        if (n == null) {
            return true;
        }
        if (n.left == null && n.right == null) {
            return true;
        }
        Test t = new Test();
        if (n.left == null) {
            return Math.abs(n.key - n.right.key) == 1 && t.isCon(n.right);
        }
        if (n.right == null) {
            return Math.abs(n.key - n.left.key) == 1 && t.isCon(n.left);
        }
        return Math.abs(n.key - n.right.key) == 1 && t.isCon(n.right) && Math.abs(n.key - n.left.key) == 1 && t.isCon(n.left);

    }

    boolean isFol(Node n) {
        if (n.left != null && n.right != null) {
            return true;
        }
        if (n == null) {
            return true;
        }
        if (n.left == null && n.right == null) {
            return true;
        }
        Test t = new Test();
        if (n.left == null) {
            return false;
        }
        if (n.right == null) {
            return false;
        }

        return t.isCon(n.right) && t.isCon(n.left);

    }

    void inOrder(Node r) {
        if (r == null) {
            return;
        }
        inOrder(r.left);
        System.out.print(r.key + " ");
        inOrder(r.right);
    }

    void preOrder(Node r) {
        if (r == null) {
            return;
        }
        System.out.print(r.key + " ");
        preOrder(r.left);
        preOrder(r.right);
    }

    void inOrderStack(Node r) {
        Stack<Node> st = new Stack<Node>();
        Node curr = r;
        while (curr != null || st.size() > 0) {
            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            System.out.print(curr.key + " ");
            curr = curr.right;
        }

    }

    void makeArrayIn(Node n, ArrayList arra) {
        if (n == null) {
            return;
        }
        makeArrayIn(n.left, arra);
        arra.add(n);
        makeArrayIn(n.right, arra);

    }

    void sumOfPreAndSuc(Node root, int n) {
        ArrayList<Node> arra = new ArrayList<Node>();
        Node p = new Node(0);
        arra.add(p);
        makeArrayIn(root, arra);
        arra.add(p);
        ArrayList<Integer> node = new ArrayList<Integer>();
        for (int i = 1; i <= n + 2; i++) {
            node.add(arra.get(i - 1).key + arra.get(i + 1).key);
        }
        int i = 0;

        Stack<Node> st = new Stack<Node>();
        Node curr = root;
        while (curr != null || st.size() > 0) {
            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            curr.key = node.get(i++);
            curr = curr.right;
        }

    }
    Node next = null;

    void PopulateInorder(Node root) {
        if (root == null) {
            return;
        }
        PopulateInorder(root.right);
        root.next = next;
        next = root;
        PopulateInorder(root.left);
    }
    static int inOrcount = 0;

    void findNthNodeInOrder(Node r, int n) {
        if (r == null) {
            return;
        }
        findNthNodeInOrder(r.left, n);
        ++inOrcount;
        if (inOrcount == n) {
            System.out.println(r.key);
            return;
        }
        findNthNodeInOrder(r.right, n);
    }
    static int preCount;

    void findPreOrder(Node r, int n) {
        if (r == null) {
            return;
        }
        ++preCount;
        if (preCount == n) {
            System.out.println(r.key);
            return;
        }
        findPreOrder(r.left, n);
        findPreOrder(r.right, n);

    }

    int heightOfTree(Node r) {
        if (r == null) {
            return 0;
        }
        return Math.max(heightOfTree(r.left), heightOfTree(r.right)) + 1;
    }

    void callLevels(Node r) {
        int h = heightOfTree(r);
        for (int i = 1; i <= h; i++) {
            printLevelOrder(r, i);
            System.out.println();
        }

    }

    void printLevelOrder(Node r, int h) {
        if (r == null) {
            return;
        }
        if (h == 1) {
            System.out.print(r.key + " ");
        }
        printLevelOrder(r.left, h - 1);
        printLevelOrder(r.right, h - 1);

    }

    void callLevelForSprial(Node p) {
        int h = heightOfTree(p);
        boolean f = false;
        for (int i = 1; i <= h; i++) {
            printSprialOrder(p, i, f);
            f = !f;
            System.out.println();
        }
    }

    void printSprialOrder(Node r, int h, boolean b) {
        if (r == null) {
            return;
        }
        if (h == 1) {
            System.out.print(r.key + " ");
        }
        if (b) {
            printSprialOrder(r.left, h - 1, b);
            printSprialOrder(r.right, h - 1, b);
        } else {
            printSprialOrder(r.right, h - 1, b);
            printSprialOrder(r.left, h - 1, b);
        }
    }

    void printLevelOrderUsingQueue(Node r) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(r);
        while (!q.isEmpty()) {
            Node temp = q.remove();
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
            System.out.print(temp.key + " ");
        }

    }
    static int posqposq = 0;

    Node makeTree(int[] in, int[] pre, int q, int p) {
        if (q > p) {
            return null;
        }
        Test ts = new Test();
        Node n = ts.new Node(pre[posqposq++]);
        if (q == p) {
            return n;
        }
        int pos = search(in, q, p, n.key);
        n.left = makeTree(in, pre, q, pos - 1);
        n.right = makeTree(in, pre, pos + 1, p);
        return n;
    }

    int search(int[] arra, int s, int e, int key) {
        int y = -1;
        for (int i = s; i <= e; i++) {
            if (arra[i] == key) {
                y = i;
                break;
            }
        }

        return y;
    }

    void linkedListToBn(LinkedList<Integer> l) {
        Queue<Node> q = new LinkedList<Node>();
        int n = l.size();
        int p = 0;
        Test ts = new Test();
        Node no = ts.new Node(l.get(p++));
        ts.root = no;
        q.add(no);
        while (p < n) {
            Node nd = q.remove();
            if (p < n) {
                nd.left = ts.new Node(l.get(p++));
                q.add(nd.left);

            }
            if (p < n) {

                nd.right = ts.new Node(l.get(p++));
                q.add(nd.right);
            }
        }
    }

    Node arrayToBn(int[] arra, Node r, int i) {
        if (i < arra.length) {
            Node n = new Node(arra[i]);
            r = n;
            r.right = arrayToBn(arra, r.right, i * 2 + 2);
            r.left = arrayToBn(arra, r.left, i * 2 + 1);

        }
        return r;
    }

    int contvertToSumTree(Node r) {
        if (r == null) {
            return 0;
        }
        int temp = r.key;
        int f = contvertToSumTree(r.left);
        int l = contvertToSumTree(r.right);
        r.key = f + l;
        return f + l + temp;
    }

    int convertToLeftSumTree(Node r) {
        if (r == null) {
            return 0;
        }
        int temp = r.key;
        int f = convertToLeftSumTree(r.left);
        r.key = f + temp;
        int l = convertToLeftSumTree(r.right);
        return f + temp + l;
    }

    int logicalAndTree(Node r) {
        if (r.left == null || r.right == null) {
            return r.key;
        }
        int f = logicalAndTree(r.left);
        int l = logicalAndTree(r.right);
        r.key = f & l;
        return r.key;
    }

    int sumPropertyBn(Node r) {
        int left_data = 0;
        int right_data = 0;
        if (r == null || (r.left == null && r.right == null)) {
            return 1;
        } else {
            if (r.left != null) {

                left_data = r.left.key;
            }
            if (r.right != null) {
                right_data = r.right.key;
            }
            if (r.key == left_data + right_data && sumPropertyBn(r.left) != 0 && sumPropertyBn(r.right) != 0) {
                return 1;

            } else {
                return 0;
            }
        }
    }

    public static void main(String args[]) {
        Test tree = new Test();
        root = tree.new Node(26);
        tree.root.left = tree.new Node(10);
        tree.root.right = tree.new Node(3);
        tree.root.left.left = tree.new Node(4);
        tree.root.left.right = tree.new Node(6);
        tree.root.right.right = tree.new Node(3);
        System.out.println(tree.sumPropertyBn(root));

    }
}
