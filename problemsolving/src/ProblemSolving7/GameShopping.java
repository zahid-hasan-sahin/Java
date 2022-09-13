package ProblemSolving7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GameShopping {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] a = new int[n];
        Queue<Integer> b = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b.add(scan.nextInt());
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (b.isEmpty()) {
                break;
            }
            if (b.peek() >= a[i]) {
                ++c;
                b.poll();
            }
        }
        System.out.println(c);
    }
}
