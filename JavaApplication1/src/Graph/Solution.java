package Graph;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    static boolean r(String s, int k, long[] res) {
        System.out.println(s+" "+k);
        if (s.length() % k != 0) {
            return false;
        }
        String p = "";
        int r = 0;
        char[] a = new char[100];
        String w = "";
        for (int i = 0; i < k; i++) {
            p += s.charAt(i);
            a[i] = s.charAt(i);
            w += s.charAt(i);
            ++r;
        }

        for (int i = k; i < s.length();) {
            p = String.valueOf(Long.valueOf(p) + 1);
            int t = 0;

            for (int j = 0; j < p.length(); j++) {
                r++;
                i++;
                a[i + j] = p.charAt(t++);
                w += a[i + j];
            }
        }
        //  System.out.println(w+" "+k);
        res[0] = Long.valueOf(w);
        return w.length() == s.length();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int q = 1;
        while (t-- > 0) {
            long n = scan.nextLong();

            String k = String.valueOf(n);
            k = k.substring(0, k.length() - 1) + ((char) (k.charAt(k.length() - 1) + 1));
            n = Long.valueOf(k);
            
            long pr = Long.MAX_VALUE;
            long r = n;
            long[] res = new long[1];
            boolean b = false;
            while (!b) {
                for (int i = 0; i < String.valueOf(n).length() - 1; i++) {
                    if (r(String.valueOf(n), i + 1, res)) {
                        b = true;
                        
                        if (res[0] - r >= 0) {
                            pr = Math.min(res[0], pr);
                        }
                    }
                }
                k = String.valueOf(n);
                k = ((char) (k.charAt(0) + 1)) + k.substring(1);

                n = Long.valueOf(k);
            }

            System.out.println("Case #" + q++ + ": " + pr);
        }

    }
}
