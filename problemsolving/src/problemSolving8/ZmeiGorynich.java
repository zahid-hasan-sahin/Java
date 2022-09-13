package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ZmeiGorynich {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int x = scan.nextInt();
            int[] d = new int[n];
            int[] h = new int[n];
            int mx = 0;
            ArrayList<Integer> a = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                d[i] = scan.nextInt();
                h[i] = scan.nextInt();
                a.add(d[i] - h[i]);
                mx = Math.max(mx, d[i]);
            }
            Collections.sort(a, Collections.reverseOrder());
            if (a.get(0) <= 0 && mx < x) {
                System.out.println("-1");
            } else {
                int p = Math.max(0, x - mx);
                int res = (int) Math.ceil((double) p / a.get(0));
                System.out.println(res + 1);
            }

        }
    }

}
