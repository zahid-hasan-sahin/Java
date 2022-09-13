package ProblemSolving5;

import java.util.Scanner;

public class MisterBandBookReading {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        int v0 = scan.nextInt();
        int v1 = scan.nextInt();
        int a = scan.nextInt();
        int l = scan.nextInt();

        int d = 0;
        int k = 0;
        while (d < c) {
            d += Math.min(v0 + (a * k), v1);           
            ++k;
            if(k>=2){
            d -= l;
            }
        }
        System.out.println(k);

    }
}
