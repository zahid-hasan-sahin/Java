package Mid;

import java.util.Scanner;

public class CheckAcc {

    static boolean CompareTo(Account a1, Account a2) {
        return a1.getAnnualInterestRate() == a2.getAnnualInterestRate();
    }

    static boolean Equals(Account a1, Account a2) {
        return a1.getBalance() == a2.getBalance();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = scan.nextInt();
        Account[] ob = new Account[n];
        for (int i = 0; i < n; i++) {
            ob[i] = new Account();
        }

    }
}
