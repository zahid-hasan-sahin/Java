package Assignment3;

class NotEnoughtMoneyException extends Exception {

    public NotEnoughtMoneyException() {
        super("Not Enought Money");
    }

    public NotEnoughtMoneyException(String message) {
        super(message);
    }
}

class Account {

    private double balance;

    public Account() {
        balance = 0;
    }

    public Account(double initialDeposit) {
        balance = initialDeposit;
    }

    public double getBalance() {
        return balance;
    }
    // returns new balance or −1 if error

    public double deposit(double amount) throws NotEnoughtMoneyException {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new NotEnoughtMoneyException();
        }
        return balance;
    }

    public double withdraw(double amount) throws NotEnoughtMoneyException {
        if ((amount > balance) || (amount < 0)) {
            throw new NotEnoughtMoneyException();
        } else {
            balance -= amount;
        }
        return balance;
    }
}

class Tester {

    public static void main(String[] args) {
        Account acc = new Account(1000);
        try {
            acc.withdraw(200000);
            System.out.println("withdraw Complete");
        } catch (NotEnoughtMoneyException e) {
            System.out.println("Error: "+e.toString());
        }
    }
}
