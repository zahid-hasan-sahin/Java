package ProblemSolving5;

import java.util.Scanner;

public class HittheLottery {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = 0;
        r += (n / 100);
        n %= 100;
        r += (n / 20);
        n %= 20;
        r += (n / 10);
        n %= 10;
        r += (n / 5);
        n %= 5;
        System.out.println(r + n);
    }

}
