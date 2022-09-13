package ProblemSolving5;

import java.util.Arrays;
import java.util.Scanner;

public class CollectingCoins {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int[] a = new int[3];
            for (int i = 0; i < 3; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            int n = scan.nextInt();
            int p = (a[2] - a[0]) + (a[2] - a[1]);
            if((n-p)%3==0 && n-p>=0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

}
