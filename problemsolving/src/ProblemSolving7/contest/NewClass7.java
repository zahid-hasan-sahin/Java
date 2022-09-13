package ProblemSolving7;

import java.util.Arrays;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class NewClass7 {
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int w = scan.nextInt();
            int[] a = new int[n];
            
            
            TreeSet<Integer> set = new TreeSet<Integer>();
            HashMap<Integer, Integer> hp = new HashMap<Integer, Integer>();
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                a[i] = in;
                set.add(a[i]);
                if (hp.containsKey(in)) {
                    hp.put(in, hp.get(in) + 1);
                } else {
                    hp.put(in, 1);
                }
                
            }
            int res = 0;
            
            while (!set.isEmpty()) {
                ArrayList<Integer> ar = new ArrayList<Integer>();
                for (int k : set) {
                    ar.add(k);
                }
                int sum = 0;
                for (int i = ar.size() - 1; i >= 0; i--) {
                    if (ar.get(i) + sum <= w) {
                        int p = ar.get(i);
                        sum += ar.get(i);
                        if (hp.get(p) <= 1) {
                            set.remove(p);       
                        } else {
                            hp.put(p, hp.get(p) - 1);
                          ++i;
                        }
                    }
                    
                }
                sum = 0;
                ++res;
            }
           sb.append(res+" \n");
            
        }
        System.out.println(sb);
    }
}
