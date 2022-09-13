package arreydemo;

import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How Many Number You Want TO Input : ");
        int t = input.nextInt();
        int[] num = new int[t];
        System.out.print("Please Enter " + t + " Number:   ");
        for (int i = 0; i < t; i++) {
            num[i] = input.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < t; i++) {
            sum = num[i] + sum;

        }
        System.out.println("sum = "+sum);
        int max = num[0];
        for (int i =1; i <t; i++) {
            if(max<num[i]){
                max =num[i];
            }
        }
        int min = num[0];
        for (int i =1; i <t; i++) {
            if(min>num[i]){
                min =num[i];
            }
        }
        System.out.println("max = "+max);
        System.out.println("min ="+min);
    }

}
