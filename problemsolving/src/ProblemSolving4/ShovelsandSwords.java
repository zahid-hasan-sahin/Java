package ProblemSolving4;

import java.util.Scanner;

public class ShovelsandSwords {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();    
            System.out.println(Math.min((a + b) / 3, Math.min(a, b)));

        }
    }
}
