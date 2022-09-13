package Mid;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private String dateCreated;

    Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;

    }

    Account(int id, Double balance) {
        this.id = id;
        this.balance = balance;
    }

    double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    double getMonthlyInterest() {
        return (balance * getMonthlyInterestRate()) / 100.0;
    }

    void withdraw(int d) {
        if (d > balance) {
            System.out.println("not possible");
        } else {
            balance -= d;
        }
    }

    void deposit(int d) {
        balance += d;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

}
