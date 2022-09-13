package Task;

public class TwoC {

    static void printReverseData(Node curr) {
        if (curr == null) {
            return;
        }
        printReverseData(curr.next);
        System.out.print(curr.data + " ");
    }

    public static void main(String args[]) {
        Node head = new Node();
        head.data = 10;
        Node n1 = new Node();
        n1.data = 20;
        Node n2 = new Node();
        n2.data = 30;

        head.next = n1;
        n1.next = n2;
        printReverseData(head);

    }
}

class Node {

    int data;
    Node next;
}
