package ProblemSolving4;

import java.util.Scanner;

public class Holidays {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int min = (n / 7) * 2;
        int max = (n / 7) * 2 + (n % 7 >= 2 ? 2 : n % 7 == 0 ? 0 : 1);

        if (n % 7 >= 5) {
            min += (n % 7 - 5);
        }
        System.out.println(min + " " + max);
    }
}
