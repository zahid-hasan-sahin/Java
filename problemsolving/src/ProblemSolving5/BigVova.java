package ProblemSolving5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BigVova {
    
    static int gcd(int a, int b) {
        
        while (b != 0) {
            int t = a;
            a = b;
            b = t % b;
        }
        return a;
        
    }
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            ArrayList<Integer> res = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                arr.add(scan.nextInt());
            }
            Collections.sort(arr, Collections.reverseOrder());
            int t = 0;
            int g = 0;
            res.add(arr.get(0));
            int k = arr.get(0);
            
            arr.remove(0);
            while (arr.size() != 0) {
                g = gcd(k, arr.get(0));
                int p = 0;
                ;
                for (int j = 0; j < arr.size(); j++) {
                    if (gcd(k, arr.get(j)) >= g) {
                        g = gcd(k, arr.get(j));
                        p = j;
                    }
                }
                k = gcd(k, arr.get(p));
                res.add(arr.get(p));
                arr.remove(p);
                
            }
            
            for (int i = 0; i < n; i++) {
                System.out.print(res.get(i) + " ");
            }
            System.out.println();
            
        }
        
    }
    
}
