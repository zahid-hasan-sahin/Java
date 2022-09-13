package ProblemSolving5;

import java.util.Scanner;

public class ToyCars {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] r = new int[n + 1];
        for (int i = 0; i < n; i++) {
            r[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int in = scan.nextInt();
                if (in == 1) {
                    r[i] = 0;
                }else if(in==2){
                    r[j] = 0;
                }else if(in==3){
                    r[i] = 0;
                    r[j] = 0;
                }
            }
        }
        int c = 0;
        for (int i = 0; i <n ; i++) {
            if(r[i]==1){
                ++c;
            }
        }
        System.out.println(c);
        for (int i = 0; i < n; i++) {
            if(r[i]==1){
                System.out.print(i+1+" ");
            }
        }
        System.out.println();
    }

}
