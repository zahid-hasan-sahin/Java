package javaapplication1;

import java.util.Scanner;

public class NewClass9 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arra = new int[n];
        for (int i = 0; i < n; i++) {
            arra[i] = scan.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arra[i]==arra[j]){
                    ++count;
                }
            }
            System.out.println(count);
            count=0;
        }    
    }

}
