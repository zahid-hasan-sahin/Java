package Lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        ArrayList<Account> acc = new ArrayList<Account>();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Press (1) for creating a Checking Account\n"
                    + "Press (2) for creating a Savings Account\n"
                    + "Press (3) for Quit");
            System.out.print("Enter: ");
            int in = scan.nextInt();
            if (in == 1) {
                System.out.print("Enter id: ");
                int id = scan.nextInt();
                System.out.print("Enter balance: ");
                double balance = scan.nextDouble();
                System.out.print("Enter annual Interest Rate:  ");
                double annualInterestRate = scan.nextDouble();
                System.out.print("How much you want to deposit: ");
                double deposit = scan.nextDouble();
                System.out.print("How much you want to withdraw: ");
                double withdraw = scan.nextDouble();
                CheckingAccount ca = new CheckingAccount(id, balance, annualInterestRate);
                ca.deposit(deposit);
                ca.withdraw(withdraw);
                acc.add(ca);
            } else if (in == 2) {
                System.out.print("Enter id: ");
                int id = scan.nextInt();
                System.out.print("Enter balance: ");
                double balance = scan.nextDouble();
                System.out.print("Enter annual Interest Rate:  ");
                double annualInterestRate = scan.nextDouble();
                System.out.print("How much you want to deposit: ");
                double deposit = scan.nextDouble();
                System.out.print("How much you want to withdraw: ");
                double withdraw = scan.nextDouble();
                SavingsAccount sa = new SavingsAccount(id, balance, annualInterestRate);
                sa.deposit(deposit);
                sa.withdraw(withdraw);
                acc.add(sa);
            } else {
                break;
            }
        }
        for (int i = 0; i < acc.size(); i++) {
            if (acc.get(i) instanceof CheckingAccount) {
                CheckingAccount ob = (CheckingAccount) acc.get(i);
                System.out.println("This is a Checking Account\n"
                        + "Account ID:" + ob.getId()
                        + "\nDate Created:" + ob.getDateCreated().getTime()
                        + "\nCurrent Balance:" + ob.getBalance()
                        + "\nAnnual Interest Rate:" + ob.getAnnualInterestRate()
                        + "\nMonthly Interest Amount:" + ob.getMonthlyInterestAmount()
                        + "\nOverdraft Limi" + ob.getOverdraft());
            } else {
                SavingsAccount ob = (SavingsAccount) acc.get(i);
                System.out.println("This is a Savings Account\n"
                        + "Account ID:" + ob.getId()
                        + "\nDate Created:" + ob.getDateCreated().getTime()
                        + "\nCurrent Balance:" + ob.getBalance()
                        + "\nAnnual Interest Rate:" + ob.getAnnualInterestRate()
                        + "\nMonthly Interest Amount:" + ob.getMonthlyInterestAmount()
                        + "\nCredit Card Number:" + ob.getCredit()
                        + "\nCard Expiry Date:" + ob.getExpireDate().getTime()
                        + "\nCredit Balance: " + ob.getCreditBalance());
            }
        }
    }
}
