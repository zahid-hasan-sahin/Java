package CSE1105;

public class Account<T> {

    private T accInfo;
    private double withdraw;
    private double deposite;

    public Account(T accInfo, double withdraw, double deposite) throws NegativeValueException {
        this.accInfo = accInfo;
        if (withdraw < 0 || deposite < 0) {
            throw new NegativeValueException();
        }
        this.withdraw = withdraw;
        this.deposite = deposite;
    }

    public T getAccInfo() {
        return accInfo;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public double getDeposite() {
        return deposite;
    }

    public void setAccInfo(T accInfo) {
        this.accInfo = accInfo;
    }

    public void setWithdraw(double withdraw) throws NegativeValueException {
        if (withdraw < 0) {
            throw new NegativeValueException();
        }
        this.withdraw = withdraw;
    }

    public void setDeposite(double deposite) throws NegativeValueException {
        if (deposite < 0) {
            throw new NegativeValueException();
        }
        this.deposite = deposite;
    }

    @Override
    public String toString() {
        return "Account{" + "accInfo=" + accInfo + ", withdraw=" + withdraw + ", deposite=" + deposite + '}';
    }

}
