package problemsolving;

import java.util.Scanner;

public class Presents {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int[] n = new int[total];
        for (int i = 0; i < total; i++) {
            n[i] = scan.nextInt();

        }
        
        for (int i = 1; i <=total; i++) {
           
            for (int j = 0; j <total; j++) {
                if(i==n[j]){
                    System.out.print(j+1+" ");
                }
            }
        }
        System.out.println();
    }
}
