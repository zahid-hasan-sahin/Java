package lightOj;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class DoubleEndedQueue {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int c = 0;
            Deque<Integer> d = new LinkedList<Integer>();
            System.out.println("Case " + t++ + ":");
            while (m-- > 0) {
                String s = scan.next();
                if (s.equals("pushLeft")) {
                    int in = scan.nextInt();
                    if (c < n) {
                        System.out.println("Pushed in left: " + in);
                        d.addFirst(in);
                        ++c;
                    } else {
                        System.out.println("The queue is full");
                    }

                } else if (s.equals("pushRight")) {
                    int in = scan.nextInt();
                    if (c < n) {
                        System.out.println("Pushed in right: " + in);
                        d.addLast(in);
                        ++c;
                    } else {
                        System.out.println("The queue is full");
                    }
                } else if (s.equals("popRight")) {
                    if (c <= 0) {
                        System.out.println("The queue is empty");
                    } else {
                        System.out.println("Popped from right: " + d.getLast());
                        d.removeLast();
                        --c;
                    }
                } else {
                    if (c <= 0) {
                        System.out.println("The queue is empty");
                    } else {
                       

                        System.out.println("Popped from left: " + d.getFirst());
                        d.removeFirst();
                        --c;

                    }

                }
            }

        }
    }

}
