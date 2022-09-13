package ProblemSolving4;

import java.io.PrintWriter;
import java.util.Scanner;

public class CodeforcesSubsequences {
   

    public static void main(String args[]) {

        PrintWriter out = new PrintWriter(System.out);
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        String s = "codeforces";
        int[] a = new int[10];
        for (int i = 0; i < s.length(); i++) {
            a[i] = 1;
        }
        long t = 1;
        int f = 0;
        while (t < n) {
            t = 1;
            ++a[f];
            ++f;
            f = f % 10;
            for (int i = 0; i < 10; i++) {
                t *= a[i];
            }
            if (t >= n) {
                break;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < a[i]; j++) {
                out.print(s.charAt(i));
            }
        }

        out.flush();
        System.out.println();
    }
}
