package ProblemSolving5;


import java.util.Scanner;
import java.util.HashSet;

public class NonzeroSegments {
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        HashSet<Long> h = new HashSet<Long>();
        long s = 0;
        int res = 0;
        h.add(Long.valueOf(0));
        for (int i = 0; i < n; i++) {
            s += a[i];
            if (h.contains(s)) {
                ++res;
                h.clear();
                h.add(Long.valueOf(0));
                s = a[i];
            }
            h.add(s);
        }
        System.out.println(res);
    }
    
}
