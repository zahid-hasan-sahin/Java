package problemSolving3;

import java.util.HashMap;
import java.util.Scanner;

public class MahmoudandEhabandthemessage {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int m = scan.nextInt();
        HashMap<String, Integer> ob = new HashMap<String, Integer>();
        String[] st = new String[n];
        int[] pr = new int[n];
        for (int i = 0; i < n; i++) {
            st[i] = scan.next();
        }
        for (int i = 0; i < n; i++) {
            pr[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            ob.put(st[i], i);
        }
        for (int i = 0; i < k; i++) {
            int mn = Integer.MAX_VALUE;
            int t = scan.nextInt();
            int[] index = new int[t];
            for (int j = 0; j < t; j++) {
                int in = scan.nextInt() - 1;
                mn = Math.min(pr[in], mn);
                index[j] = in;
            }
            for (int j = 0; j < t; j++) {
                pr[index[j]] = mn;
            }
        }
        long res = 0;
        for (int i = 0; i < m; i++) {
            String in = scan.next();
            res += pr[ob.get(in)];
        }
        System.out.println(res);

    }

}
