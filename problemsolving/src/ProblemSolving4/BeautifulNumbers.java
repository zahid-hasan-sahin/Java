package ProblemSolving4;

import java.io.PrintWriter;
import java.util.Scanner;

public class BeautifulNumbers {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        PrintWriter out = new PrintWriter(System.out);
        while (q-- > 0) {
            int n = scan.nextInt();
            int a[] = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                int k = scan.nextInt();
                a[k] = i;
            }
            
            int max = -1;
            int min = Integer.MAX_VALUE;
            for (int i = 1; i <= n; i++) {
                max = Math.max(max, a[i]);
                min = Math.min(min, a[i]);
                if (max - min + 1 == i) {
                    out.print("1");
                } else {
                    out.print("0");
                }
            }
            out.close();
            out.println();

        }
        
    }

}
