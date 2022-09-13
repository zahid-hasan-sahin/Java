package ProblemSolving4;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberGame {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            if (n == 1) {
                System.out.println("FastestFinger");
            } else if (n % 2 == 1) {
                System.out.println("Ashishgup");
            } else {
                int c = 0;
                int k = 0;
                ArrayList<Integer> a = new ArrayList<Integer>();
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {                      
                        while (n % i == 0) {
                            n = n / i;
                            ++c;
                        }
                    }
                }
                if (n >= 2) {
                    ++c;
                }
                if (c <=2) {
                    System.out.println("FastestFinger");
                } else {
                    System.out.println("Ashishgup");

                }

            }
        }

    }
}
