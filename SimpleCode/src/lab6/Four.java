package lab6;

public class Four {

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

    static Node min(Node root, int l) {
        Node temp = root;
        int k = 0;
        Node minNode = null;
        int min = 1000000000;
        while (temp != null) {
            if (k >= l) {
                if (temp.data <= min) {
                    min = temp.data;
                    minNode = temp;
                }

            }
            temp = temp.next;

            ++k;
        }
        return minNode;
    }

    static void selectionSort(Node root, Node currIndex, int l) {

        if (currIndex == null) {
            return;
        }
        Node mn = min(root, l);
        int temp = currIndex.data;
        currIndex.data = mn.data;
        mn.data = temp;
        selectionSort(root, currIndex.next, l + 1);

    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();

    }

    public static void main(String args[]) {
        Four ob = new Four();
        
        ob.add(3);
        ob.add(5);
        ob.add(3);
        ob.add(5);
        ob.add(6);
        ob.add(1);
        ob.add(6);
        ob.add(8);
        ob.add(9);
        
        selectionSort(ob.head, ob.head, 0);
        print(ob.head);
    }
}
