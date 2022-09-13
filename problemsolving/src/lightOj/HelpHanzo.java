package lightOj;

import java.util.ArrayList;
import java.util.Scanner;

public class HelpHanzo {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt(), t = 1;
        int[] a = new int[46345];
        int n = 0;
        for (int i = 2; i < 46345; i++) {
            if (a[i] == 0) {
                for (long j = (long) i * i; j < 46345; j += i) {
                    a[(int) j] = 1;
                }
            }
        }
        for (int i = 2; i < 46345; i++) {
            if (a[i] == 0) {
                a[n++] = i;

            }
        }
        while (q-- > 0) {
            int p = scan.nextInt();
            int r = scan.nextInt();
            if (p == 1) {
                ++p;
            }
            int c = 0;

            int mx = r - p + 1;
            int[] ar = new int[mx];
       
            for (int i = 0; i < n; i++) {
                int k = a[i];
                int y = a[i];
               
                if (k <= r) {
                    k = (p / k) * k;
                    if (k < p) {
                        k = k + y;
                    }
                    for (int j = k; j <= r; j += y) {
                       
                        if (j != y) {
                            ar[j - p] = 1;
                        }
                    }
                } else {
                    break;
                }
            }
           
            for (int i = 0; i < mx; i++) {
               
                if (ar[i] == 0) {
                   
                    ++c;
                }
            }
            System.out.print("Case " + t++ + ": ");
            System.out.println(c);
            
        }
    }
}
