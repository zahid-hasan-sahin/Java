package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Playlist {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        ArrayList<Song> a = new ArrayList<Song>();
        for (int i = 0; i < n; i++) {
            Song ob = new Song();
            ob.l = scan.nextInt();
            ob.b = scan.nextInt();
            a.add(ob);
        }
        Collections.sort(a, new myCom());
        PriorityQueue<Long> q = new PriorityQueue<Long>();
        long res = 0;
        long sum = 0;
        for (int i = 0; i < k; i++) {
            q.add(a.get(i).l);
            sum += a.get(i).l;
            res = Math.max(res, sum * a.get(i).b);
        }
        for (int i = k; i < n; i++) {
            if (q.peek() < a.get(i).l) {
                sum -= q.poll();
                sum += a.get(i).l;
                q.add(a.get(i).l);
            }
            res = Math.max(res, sum * a.get(i).b);

        }
        System.out.println(res);
    }
}

class myCom implements Comparator<Song> {

    @Override
    public int compare(Song a, Song b) {
        if (a.b > b.b) {
            return -1;
        } else if (a.b < b.b) {
            return 1;
        } else {
            return 0;
        }
    }

}

class Song {

    long l;
    long b;
}
