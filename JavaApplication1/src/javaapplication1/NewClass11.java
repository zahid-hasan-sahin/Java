package javaapplication1;

import java.util.Scanner;

public class NewClass11 {

    static boolean isPrime(int n) {
// Corner case 
        if (n <= 1) {
            return false;
        }

// Check from 2 to n-1 
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

// Function to print primes 
    static void printPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print(2+" "+" 3"+ " 5"+" 7");
        for (int i = 2; i < 1000; i++) {
            
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i%11!=0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
        int n = 1000;
        printPrime(n);

    }

}
