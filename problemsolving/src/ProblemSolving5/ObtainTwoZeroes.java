package ProblemSolving5;

import java.util.Scanner;

public class ObtainTwoZeroes {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (Math.min(a, b) * 2 >= Math.max(a, b) && (a + b) % 3 == 0) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
