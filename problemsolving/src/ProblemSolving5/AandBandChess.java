package ProblemSolving5;

import java.util.Scanner;

public class AandBandChess {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int w = 0;
        int b = 0;
        for (int i = 0; i < 8; i++) {
            String s = scan.next();
            
            for (int j = 0; j < 8; j++) {
                if (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') {
                    if (s.charAt(j) == 'q') {
                        b += 9;
                    } else if (s.charAt(j) == 'r') {
                        b += 5;
                    } else if (s.charAt(j) == 'b') {
                        b += 3;
                    } else if (s.charAt(j) == 'n') {
                        b += 3;
                    } else if (s.charAt(j) == 'p') {
                        b += 1;
                    }
                } else {
                    if (s.charAt(j) == 'Q') {
                        w += 9;
                    } else if (s.charAt(j) == 'R') {
                        w += 5;
                    } else if (s.charAt(j) == 'B') {
                        w += 3;
                    } else if (s.charAt(j) == 'N') {
                        w += 3;
                    } else if (s.charAt(j) == 'P') {
                        w += 1;
                    }
                }
            }

        }
       
        if (w > b) {
            System.out.println("White");
        } else if (b > w) {
            System.out.println("Black");
        } else {
            System.out.println("Draw");
        }
    }

}
