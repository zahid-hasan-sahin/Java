package ProblemSolving7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class JeffandPeriods {
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] f = new int[100010];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            ++f[a[i]];
        }
        
        int[] pPos = new int[100010];
        int[] diff = new int[100010];
        for (int i = 0; i < 100010; i++) {
            pPos[i] = -1;
            diff[i] = -1;
        }
        int[] res = new int[100010];
        for (int i = 0; i < n; i++) {
            if (res[a[i]] != -1) {
                if (pPos[a[i]] == -1) {
                    pPos[a[i]] = i;
                } else {
                    int k = i - pPos[a[i]];
                    pPos[a[i]] = i;
                    if (diff[a[i]] == -1) {
                        diff[a[i]] = k;
                        res[a[i]] = k;
                    } else if (diff[a[i]] != k) {
                        res[a[i]] = -1;
                    } else {
                        res[a[i]] = k;
                    }
                }
            }
        }
     
        TreeSet<Integer> h = new TreeSet<Integer>();
        for (int i = 0; i < n; i++) {
            h.add(a[i]);
        }
        StringBuilder sb = new StringBuilder();
        int c = 0;
        for (int k : h) {
            if (res[k] == -1 || res[k] == 0) {
                if (f[k] == 1) {
                    sb.append(k + " " + res[k] + "\n");
                    ++c;
                }
            } else {
                sb.append(k + " " + res[k] + "\n");
                ++c;
            }
        }
        System.out.println(c);
        System.out.println(sb);
        
    }
    
}
