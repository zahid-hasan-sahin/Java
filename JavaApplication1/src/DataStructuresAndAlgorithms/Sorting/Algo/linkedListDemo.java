package DataStructuresAndAlgorithms.Sorting.Algo;

class linked {

    static void addF(int d) {
        Node n = new Node(d);
        n.next = n.head;
        n.head = n;

    }

    static void push(int d) {
        Node n = new Node(d);
        if (n.head == null) {
            n.head = n;
        } else {
            addL(d);
        }
    }

    static void addL(int d) {
        Node k = new Node(d);
        Node ch = k.head;
        while (ch.next != null) {
            ch = ch.next;
        }
        ch.next = k;

    }

    static void addIn(int t, int d) {
        Node p = new Node(d);
        Node y = p.head;
        while (y.data != t && y.next != null) {
            y = y.next;
        }
        p.next = y.next;
        y.next = p;
    }

    static void del(int d) {
        Node n = new Node(d);
        Node k = n.head;
        if (k.data == d) {
            n.head = k.next;

        } else {

            Node t;
            while (true) {
                t = k;
                k = k.next;
                if (k.next == null) {
                    break;
                } else if (k.data == d) {
                    t.next = k.next;
                    break;
                }

            }

        }

    }

    static void delPos(int d) {
        Node n = new Node(d);
        Node k = n.head;
        int i = 1;
        Node t;
        if (d == 0) {
            n.head = k.next;
        } else {
            while (true) {
                t = k;
                k = k.next;
                if (k.next == null) {
                    if (d == i) {
                        t.next = k.next;
                    }
                    break;
                } else if (d == i) {
                    t.next = k.next;
                    break;
                }
                ++i;
            }

        }
    }

    void rev(Node node) {
        Node pre = null;
        Node n = new Node(56);
        Node curr = node;
        Node next = null;

        n.head = pre;
        Node k = n.head;
        while (k != null) {
            System.out.println(k.data);
            k = k.next;
        }
    }

    public static void main(String args[]) {
        Node n = new Node(5);
        Node n1 = new Node(4);
        Node n2 = new Node(2);
        Node n3 = new Node(56);
        Node n4 = new Node(90);
        System.out.println(n);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        n.head = n;
        n.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        Node k = n.head;
        while (k != null) {
            System.out.println(k.data);
            k = k.next;
        }
    }

}
