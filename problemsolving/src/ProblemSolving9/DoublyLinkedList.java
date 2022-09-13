package ProblemSolving9;

import java.util.Scanner;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    int size;

    public void insert(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
        size++;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        newNode.prev = tail;
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = newNode;
        }
        size++;
    }

    public Node deleteFirst() {

        Node temp = head;
        head = head.next;
        head.prev = null;
        size--;
        return temp;
    }

    public Node deleteLast() {

        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        return temp;
    }

    public void delete(int value) {
        if (this.head == null) {

            System.out.print("Empty");
        }
        if (this.head.data == value) {

            this.head = this.head.next;
            if (this.head != null) {
                this.head.prev = null;
            } else {

                this.tail = null;
            }
        } else if (this.tail.data == value) {

            this.tail = this.tail.prev;
            if (this.tail != null) {
                this.tail.next = null;
            } else {

                this.head = null;
            }
        } else {

            Node temp = this.head;

            while (temp != null && temp.data != value) {
                temp = temp.next;
            }
            if (temp == null) {

                System.out.println("node not found");
            } else {

                temp.prev.next = temp.next;
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }
            }
        }
    }

    public void printLinkedListForward() {

        Node current = head;
        while (current != null) {
            current.displayNodeData();
            current = current.next;
        }
        System.out.println();
    }

}

class Node {

    public int data;
    public Node next;
    public Node prev;

    public void displayNodeData() {
        System.out.print(data + " ");
    }
}

class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoublyLinkedList dl = new DoublyLinkedList();
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            if (s.equals("insert")) {
                int in = scan.nextInt();
                dl.insert(in);
            } else if (s.equals("delete")) {
                int in = scan.nextInt();
                dl.delete(in);

            } else if (s.equals("deleteFirst")) {
                dl.deleteFirst();

            } else if (s.equals("deleteLast")) {
                dl.deleteLast();
            }
        }
        dl.printLinkedListForward();
    }
}
