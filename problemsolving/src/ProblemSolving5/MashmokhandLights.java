package ProblemSolving5;

import java.util.Scanner;

public class MashmokhandLights {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int a[] = new int[m];
        int[] r = new int[n+1];
        for (int i = 0; i < m; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < m; i++) {
            for (int j = a[i]; j <= n; j++) {
                if(r[j]==0){
                    r[j] = a[i];
                }
            }
        }
        for (int i =1; i <= n; i++) {
            System.out.print(r[i]+" ");
        }
        System.out.println();

    }

}
