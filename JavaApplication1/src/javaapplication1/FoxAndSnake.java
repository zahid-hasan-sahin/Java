package javaapplication1;

import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String substr = scan.next();
        int count = 0;
        for (int i = 0; i < str.length()-substr.length(); i++) {
            if(str.substring(i, i+substr.length()).equalsIgnoreCase(substr)){
                ++count;
            }
        }
        System.out.println(count);
    }

}
