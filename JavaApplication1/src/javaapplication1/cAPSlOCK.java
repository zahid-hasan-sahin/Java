package javaapplication1;

import java.util.Scanner;

public class cAPSlOCK {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next().toLowerCase();
        String temp = s.substring(0, 1).toUpperCase() + s.substring(1, s.length());

        System.out.println(temp);
    }

}
