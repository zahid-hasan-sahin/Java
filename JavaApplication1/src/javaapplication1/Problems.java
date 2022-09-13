package javaapplication1;

import java.util.Scanner;

public class Problems {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How Many Lan: ");
        int l = scan.nextInt();
        System.out.print("How Many Car: ");
        int car = scan.nextInt();
        int wheel = 1, temp = 2, temp_pass = 0, passenger = 0;
        for (int i = 1; i <= l; i++) {

            wheel = (temp * car * i) / i;
            temp_pass = wheel * 2;
            passenger = passenger + temp_pass;
            temp = temp + 1;
            car = car + 1;

        }
        System.out.println(passenger);

    }

}
