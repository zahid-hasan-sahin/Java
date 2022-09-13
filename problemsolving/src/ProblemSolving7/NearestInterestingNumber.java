package ProblemSolving7;

import java.util.Scanner;

public class NearestInterestingNumber {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = n; i <= 10000; i++) {
            String s = String.valueOf(i);
            int sum = 0;
            for (int j = 0; j < s.length(); j++) {
                sum += s.charAt(j) - '0';
            }
            if (sum % 4 == 0) {
                System.out.println(i);
                break;
            }
        }
    }

}
