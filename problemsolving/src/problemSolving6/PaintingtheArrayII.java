package problemSolving6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PaintingtheArrayII {

    public static void main(String args[]) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        Queue<Integer>[] f = new LinkedList[n + 10];
        for (int i = 0; i < n + 10; i++) {
            f[i] = new LinkedList<Integer>();
        }
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            f[a[i]].add(i);

        }

        ArrayList<Integer> ar = new ArrayList<Integer>();
        ArrayList<Integer> br = new ArrayList<Integer>();
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ar.size() == 0 || ar.get(ar.size() - 1) == a[i]) {
                if(ar.size()==0){
                    ++res;
                }
                ar.add(a[i]);
                f[a[i]].poll();
            } else if (br.size() == 0 || br.get(br.size() - 1) == a[i]) {
                if(br.size()==0){
                    ++res;
                }
                br.add(a[i]);
                f[a[i]].poll();
            } else if (br.get(br.size() - 1) == a[i] && ar.get(ar.size() - 1) == a[i]) {
                ar.add(a[i]);
                f[a[i]].poll();
            } else {
                ++res;

                if (f[br.get(br.size() - 1)].peek() == null) {
                    br.add(a[i]);
                    f[a[i]].poll();
                } else if (f[ar.get(ar.size() - 1)].peek() == null) {
                    ar.add(a[i]);
                    f[a[i]].poll();
                } else if (f[br.get(br.size() - 1)].peek() > f[ar.get(ar.size() - 1)].peek()) {
                    br.add(a[i]);
                    f[a[i]].poll();
                } else {
                    ar.add(a[i]);
                    f[a[i]].poll();
                }
            }
        }

        System.out.println(res);
    }
}
