package ProblemSolving5;

import java.util.Scanner;

public class ThreeGarlands {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10000];
        for (int i = 0; i < 3; i++) {
            ++a[scan.nextInt()];
        }
        if (a[3] >= 3) {
            System.out.println("YES");
        } else if (a[1] >= 1) {
            System.out.println("YES");
        } else if (a[2] >= 2) {
            System.out.println("YES");
        } else if(a[2]==1 && a[4]==2) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
