package admissiontest.problem2;

public class PersonalLoan extends Loan {
    
    public PersonalLoan(String loanNumber, String customerName, int amountOfLoan, int term, double primeRate) {
        super(loanNumber, customerName, amountOfLoan, term);
        this.setInterestRate(primeRate + 2.7);
    }
    
}
