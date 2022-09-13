package ProblemSolving4;

import java.util.Scanner;

public class NewYearandDays {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] a = s.split(" ", -1);

        int n = Integer.valueOf(a[0]);
        if (a[2].equals("month")) {
            if (n == 31) {
                System.out.println("7");
            } else if (n > 29) {
                System.out.println("11");
            } else {
                System.out.println("12");
            }
        } else {
            int p = 366 / 7;
            if (n == 5 || n == 6) {
                ++p;
            }
            System.out.println(p);

        }
    }

}
