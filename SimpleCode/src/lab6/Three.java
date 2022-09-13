package lab6;

public class Three {

    Node head;
    int size = 0;

    void add(int n) {
        ++size;
        if (head == null) {
            head = new Node(n, null);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(n, null);
    }
}

class Node {

    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class Tester {

    static void bubbleSort(Node head, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n; i++) {
            Node curr = head;
            Node next = head.next;
            for (int j = 0; j < n - i - 1; j++) {
                if (curr.data > next.data) {
                    int temp = curr.data;
                    curr.data = next.data;
                    next.data = temp;
                }
                curr = curr.next;
                next = next.next;
            }
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
        Three ob = new Three();
        ob.add(3);
        ob.add(5);
        ob.add(3);
        ob.add(5);
        ob.add(6);
        ob.add(1);
        ob.add(6);
        ob.add(8);
        ob.add(9);
        bubbleSort(ob.head, ob.size);
        print(ob.head);
    }
}
