package lab6;

public class Five {

    Node head;

    void add(int n) {
        if (head == null) {
            head = new Node(n, null, null);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(n, temp, null);

    }

    public void InsertAfter(Node preNode, int data) {

        if (preNode == null) {
            Node newNode = new Node(data, null, head);
            head.pre = newNode;
            head = newNode;
            return;
        }
        Node newNOde = new Node(data, null, null);

        newNOde.next = preNode.next;

        preNode.next = newNOde;

        newNOde.pre = preNode;

        if (newNOde.next != null) {
            newNOde.next.pre = newNOde;
        }
    }

    void deleteNode(Node node) {

        if (node == null) {
            return;
        }

        if (head == node) {
            head = node.next;
        }
        if (node.pre != null) {
            node.pre.next = node.next;
        }
        
        if (node.next != null) {
            node.next.pre = node.pre;
        }

        return;
    }

    void insertionSort(Node root) {
        Node tempRoot = root.next;
        while (tempRoot != null) {
            Node key = tempRoot;
            Node j = key.pre;

            while (j != null && j.data > key.data) {
                j = j.pre;
            }
            tempRoot = tempRoot.next;
            Node temp = key;
            InsertAfter(j, temp.data);
            deleteNode(temp);

        }
    }

    static void print(Node head) {
        while (head != null) {

            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();

    }

    public static void main(String args[]) {
        Five ob = new Five();

        ob.add(3);
        ob.add(5);
        ob.add(3);
        ob.add(5);
        ob.add(6);
        ob.add(1);
        ob.add(6);
        ob.add(8);
        ob.add(9);

        ob.insertionSort(ob.head);
        print(ob.head);
    }

}

class Node {

    int data;
    Node pre, next;

    Node(int data, Node pre, Node next) {
        this.data = data;
        this.pre = pre;
        this.next = next;
    }

}
