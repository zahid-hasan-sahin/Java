package ProblemSolving4;

import java.util.Scanner;

public class CanyouGuess {

    public static long sumOfDiv(int n) {
        if(n==1){
            return 0;
        }
        long res = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i != i) {
                    res += i;
                    res += (n / i);
                } else {
                    res += i;
                }
            }
        }
        return res + 1;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            System.out.println(sumOfDiv(n));
        }
    }

}
