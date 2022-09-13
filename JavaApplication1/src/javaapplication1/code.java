package javaapplication1;

import java.util.Scanner;

public class code {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int j = 0;
        System.out.print("Please Enter The World: ");
        String word = scan.nextLine();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'A' || word.charAt(i) == 'a') {
                j = (int) word.charAt(i) + 25;

            } else if (word.charAt(i) == 'Z' || word.charAt(i) == 'z') {
                j = (int) word.charAt(i) - 25;

            } else if (word.charAt(i) == ' ') {
                j = (int) word.charAt(i);
            } else {
                j = (int) word.charAt(i) - 1;
            }
            char c = (char) j;
            System.out.print(c);

        }
        System.out.println();

    }

}
