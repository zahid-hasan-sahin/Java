package problemSolving8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class cfContest1538 {
    
    static int lowerIndex(ArrayList<Integer> arr, int n, int x) {
        int l = 0, h = n - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr.get(mid) >= x) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
    
    static int upperIndex(ArrayList<Integer> arr, int n, int y) {
        int l = 0, h = n - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr.get(mid) <= y) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return h;
    }
    
    static int c(ArrayList<Integer> arr, int n, int x, int y) {
        
        int count = 0;
        count = upperIndex(arr, n, y)
                - lowerIndex(arr, n, x) + 1;
        return count;
    }
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            
            int l = scan.nextInt();
            int r = scan.nextInt();
            HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
            ArrayList<Integer> a = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                a.add(scan.nextInt());
                h.put(a.get(i), h.getOrDefault(a.get(i) + 1, 1));
            }
            Collections.sort(a);
            long res = 0;
            for (int i = 0; i < n; i++) {
                res += c(a, n, l - a.get(i), r - a.get(i));
                if (a.get(i) > (l - a.get(i) - 1) && a.get(i) <= (r - a.get(i))) {
                    res -= h.get(a.get(i));
                    
                }
            }
            System.out.println(res / 2);
        }
    }
}
