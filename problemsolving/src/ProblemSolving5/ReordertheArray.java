package ProblemSolving5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class ReordertheArray {
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        long res = 1;
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            if (h.containsKey(in)) {
                int e = h.get(in);
                h.put(in, e + 1);
                res = Math.max(res, e + 1);
            } else {
                h.put(in, 1);
            }
        }
        System.out.println(n-res);
        
    }
}
