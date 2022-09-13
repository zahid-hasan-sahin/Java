package problemSolving8;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Potions {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        long s = 0;

        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        int res = 0;
        for (int i = 0; i < n; i++) {
            s += a[i];
            q.add(a[i]);
            while (s < 0) {
                s -= q.poll();
            }
        }
        System.out.println(q.size());

    }

}
