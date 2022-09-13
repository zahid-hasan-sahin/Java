package problemSolving3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class TwoTeamsComposing {

        public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = scan.nextInt();
        while (t-- > 0) {
 
            int n = scan.nextInt();
            int arra[] = new int[200010];
            int r = 1;
            HashSet<Integer> h = new HashSet<Integer>();
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                ++arra[in];
                r = Math.max(r, arra[in]);
                h.add(in);
            }
            int d = h.size();
         
            if (r > d) {
                --r;
            } else {
                --d;
            }
           sb.append(Math.min(r, Math.min(d, n / 2)) + "\n");
            }
        System.out.println(sb);
    }
 
}