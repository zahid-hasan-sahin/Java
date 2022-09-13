package newpackage1;
public class Account implements ITansactions {

    public int accountNumber;
    public double balance;
    String name;
    int nid;
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void showInfo() {
        System.out.println("Account_Number: " + accountNumber + "\n" + "Balance: " + balance);
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
    }

    @Override
    public void withdraw(double amount) {
        balance = balance - amount;
    }

}