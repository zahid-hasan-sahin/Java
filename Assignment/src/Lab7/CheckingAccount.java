package Lab7;

public class CheckingAccount extends Account {

    private double overdraft;

    CheckingAccount() {
        super();
        overdraft = -100;
    }

    CheckingAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }

    @Override
    public void withdraw(double amount) {
        if (this.getBalance() - amount >= overdraft) {
            super.withdraw(amount);
        }
    }

    public double getOverdraft() {
        return overdraft;
    }
    
}
