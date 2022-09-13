package problemSolving8;

import java.util.HashMap;
import java.util.Scanner;

public class PowersofTwo {
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        HashMap<Long, Integer> h = new HashMap<Long, Integer>();
        h.put((long)a[0], 1);
        
        long res = 0;
        for (int i = 1; i < n; i++) {
            long k = 1;
            if (h.containsKey(k - a[i])) {
                res += h.get(k - a[i]);
            }
            for (int j = 0; j < 34; j++) {
                k *= 2;
              
                if (h.containsKey(k - a[i])) {
                    res += h.get(k - a[i]);
                }
            }
            h.put(a[i], h.getOrDefault(a[i], 0) + 1);
        }
        System.out.println(res);
    }
    
}
