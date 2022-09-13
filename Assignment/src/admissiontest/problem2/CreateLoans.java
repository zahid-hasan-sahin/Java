package admissiontest.problem2;

import java.util.Scanner;

public class CreateLoans {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 5;
        Loan[] loan = new Loan[n];
        System.out.print("Enter current prime interest rate: ");
        double primeInterest = scan.nextDouble();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter data for loanNumber - " + (i + 1));
            String loanNumber = String.valueOf(i + 1);
            System.out.print("Enter customer name:");
            String customerName = scan.next();
            System.out.print("Enter amount to loan:");
            int amountOfLoan = scan.nextInt();
            System.out.print("Enter year- short-term (3 years), medium-term (7 years), and long-term (15 years):");
            int term = scan.nextInt();

            System.out.print("Enter type of loan:");
            String type = scan.next();
            if (type.equalsIgnoreCase("BusinessLoan")) {
                loan[i] = new BusinessLoan(loanNumber, customerName, amountOfLoan, term, primeInterest);
            } else if (type.equalsIgnoreCase("PersonalLoan")) {
                loan[i] = new PersonalLoan(loanNumber, customerName, amountOfLoan, term, primeInterest);
            } else {
                System.out.println("type is'nt valid");
                return;
            }
            System.out.println();

        }

        for (int i = 0; i < n; i++) {
            System.out.println(loan[i].toString());
        }

    }

}
