package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        String s = scan.next();
        int c = 0;
        int h = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' ) {
                c++;
            } else if (s.charAt(i) == ')') {
                h++;
            }if( s.charAt(i)+s.charAt(i)=='('+')' ){
                
            }

        }
        if (c == h) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

}
