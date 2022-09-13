package ProblemSolving7;

import java.util.Scanner;

public class GuesstheKthZero {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = scan.nextInt();
        int k = scan.nextInt();
        int l = 1;
        int r = n;

      
        while (l <= r) {
            int mid = (l + r) / 2;
            System.out.println("? " + l + " " + mid);
            int sum = scan.nextInt();
            if (sum + k <= (mid - l + 1)) {
                if (l == mid) {
                    System.out.println("! " + l);
                    return;
                }
                r = mid - 1;
            } else {
                k -= ((mid - l + 1) - sum);
                l = mid + 1;

            }

        }
        System.out.println("! " + l);
    }

}
