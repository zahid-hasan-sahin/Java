package problemSolving2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class JustEatIt {

    static int sum(ArrayList a, int size) {

        int max_so_far = 0, max_ending_here = 0;

        for (int i = 0; i < size - 1; i++) {
            int t = (int)a.get(i);
            max_ending_here = (max_ending_here + t);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            } else if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }


        }
        int t0 = (int)(a.get(0));
        int t1 = (int)(a.get(size-1));
        
        
        return Math.max(max_so_far, (max_so_far - t0) +t1);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuffer sb = new StringBuffer();
        while (t-- > 0) {
            int n = scan.nextInt();
            HashSet<Integer> p = new HashSet<Integer>();
            ArrayList<Integer> a = new ArrayList<Integer>();

            for (int i = 0; i < n; i++) {

                p.add(scan.nextInt());
            }
            a.addAll(p);
            int y = 0;
            for (int k : p) {
                y += k;
            }
            int sum = sum(a, a.size());
            System.out.println(sum);
            sb.append(y > sum ? "YES\n" : "NO\n");

        }
        System.out.println(sb);

    }

}
