package problemSolving8;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ConstructingtheArray {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            PriorityQueue<segment> q = new PriorityQueue<segment>(new myCom());
            q.add(new segment(1, n));
            int[] a = new int[n + 1];
            int c = 1;
            while (true) {
                segment curr = q.poll();
                int l = curr.l;
                int r = curr.r;
                if (l > r) {
                    break;
                }
                if ((r - l + 1) % 2 == 1) {
                    a[(l + r) / 2] = c++;
                    q.add(new segment(l, (l + r) / 2 - 1));
                    q.add(new segment((l + r) / 2 + 1, r));
                } else {
                    a[(l + r - 1) / 2] = c++;
                    q.add(new segment(l, (l + r - 1) / 2 - 1));
                    q.add(new segment((l + r - 1) / 2 + 1, r));
                }

            }
            for (int i = 1; i <= n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}

class myCom implements Comparator<segment> {

    @Override
    public int compare(segment a, segment b) {
        int x = a.r - a.l;
        int y = b.r - b.l;
        if (x > y) {
            return -1;
        } else if (x < y) {
            return 1;
        } else {
            if (a.l < b.l) {
                return -1;
            } else if (a.l > b.l) {
                return 1;
            } else {
                return 0;
            }
        }
    }

}

class segment {

    int l = 0;
    int r = 0;

    segment(int l, int r) {
        this.l = l;
        this.r = r;
    }
}
