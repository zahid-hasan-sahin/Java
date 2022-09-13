package problemSolving8;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Snacktower {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
        int k = n;
        for (int i = 0; i < n; i++) {
            q.add(a[i]);
            if (q.peek() == k) {
                while (!q.isEmpty() && q.peek() == k) {
                    System.out.print(q.poll() + " ");
                    --k;
                }
                System.out.println();
            } else {
                System.out.println();
            }
        }

    }
}
