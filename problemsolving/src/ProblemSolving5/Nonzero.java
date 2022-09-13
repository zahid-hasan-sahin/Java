package ProblemSolving5;

import java.util.Scanner;

public class Nonzero {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int s = 0;
            int c = 0;
            for (int i = 0; i < n; i++) {
                int k = scan.nextInt();
                s += k;
                if (k == 0) {
                    ++s;
                    ++c;
                }
            }
            long res = c;
            if(s==0){
                ++res;
            }
            System.out.println(res);
        }

    }

}
