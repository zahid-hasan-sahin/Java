package NumberTheory;

import java.util.Scanner;

class PrimalityTest {

    public static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int t = scan.nextInt();
        while (t-- > 0) {
            long n = scan.nextLong();
            if (isPrime(n)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
