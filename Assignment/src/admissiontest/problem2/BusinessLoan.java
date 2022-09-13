package admissiontest.problem2;

public class BusinessLoan extends Loan {
    
    public BusinessLoan(String loanNumber, String customerName, int amountOfLoan, int term, double primeRate) {
        super(loanNumber, customerName, amountOfLoan, term);
        this.setInterestRate(primeRate + 3.2);
        
    }
    
}
