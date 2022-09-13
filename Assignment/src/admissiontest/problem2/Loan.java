package admissiontest.problem2;

import java.util.Objects;

public abstract class Loan implements LoanConstants {

    private String loanNumber;
    private String customerName;
    private int amountOfLoan;
    private double interestRate;
    private int term;

    public Loan(String loanNumber, String customerName, int amountOfLoan, int term) {
        if (amountOfLoan > maxLoanAmount) {
            System.out.println("not allow loan amounts greater than $50,000 , loan amount set to 50,000");
            amountOfLoan = 50000;
        }
        this.loanNumber = loanNumber;
        this.customerName = customerName;
        this.amountOfLoan = amountOfLoan;
        if (term != shortTerm && term != mediumTerm && term != longTerm) {
            this.term = shortTerm;
        } else {
            this.term = term;
        }
    }

    @Override
    public String toString() {
        return "Loan{" + "loanNumber=" + loanNumber + ", customerName=" + customerName + ", amountOfLoan=" + amountOfLoan + ", interestRate=" + interestRate + ", term=" + term + ",totalAmountOwed=" + this.totalAmountOwed() + '}';
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double totalAmountOwed() {
        return amountOfLoan + ((amountOfLoan * interestRate) / 100.00) * term;
    }

}
