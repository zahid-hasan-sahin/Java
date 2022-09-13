package problemsolving;

import java.util.Scanner;

public class LoveA {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countA = 0;
        String s = scan.next();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a'){
                ++countA;
            }
        }
           System.out.println(countA>s.length()/2?s.length():countA*2-1);
    }

}
