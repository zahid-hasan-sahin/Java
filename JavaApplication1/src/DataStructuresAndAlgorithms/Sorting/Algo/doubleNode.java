package DataStructuresAndAlgorithms.Sorting.Algo;

public class doubleNode {

    static void append(int d) {
        doubNode n = new doubNode(d);
        if (n.head == null) {
            n.head = n;
            n.next = n.last;
            n.pre = null;
            n.last = n;
        } else {
            n.pre = n.last;
            n.last.next = n;
        }

    }

    public static void main(String args[]) {

    }

}
