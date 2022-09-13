package ProblemSolving5;

import java.util.Arrays;
import java.util.Scanner;

public class ThreePairwiseMaximums {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int[] a = new int[3];
            for (int i = 0; i < 3; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            if (a[1] == a[2]) {
                System.out.println("YES");
                System.out.println(a[0]+" "+a[0]+" "+a[2]);
               
            }else{
                System.out.println("NO");
            }
        }
    }

}
