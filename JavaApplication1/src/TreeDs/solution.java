package TreeDs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Solution {

    public static void preOrder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        while (true) {
            if (root.data < data) {
                root = root.right;
            } 
           if(root.right ==null){
           root = new Node(data);
           return root;
           }
           
            else {
                root = root.left;
            }
           if(root.left ==null){
           root = new Node(data);
           return root;
           }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        preOrder(root);
    }
}
