package CSE110;

import java.util.ArrayList;

public class CreditCard extends ATMCard {

    private double salary;
    private double expense;
    private int linkedacc;
    private double mrpint;
    private double withdrawlimit;
    ArrayList<Bonus> bonus = new ArrayList<Bonus>();

    CreditCard(int cnum, int cvc, double limit, int linkedacc, double mrpint, double withdrawlimit) {
        super(cnum, cvc, limit);
        this.linkedacc = linkedacc;
        this.mrpint = mrpint;
        this.withdrawlimit = withdrawlimit;
    }

    public double getSalary() {
        return salary;
    }

    public double getExpense() {
        return expense;
    }

    public int getLinkedacc() {
        return linkedacc;
    }

    public double getMrpint() {
        return mrpint;
    }

    public double getWithdrawlimit() {
        return withdrawlimit;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public void setLinkedacc(int linkedacc) {
        this.linkedacc = linkedacc;
    }

    public void setMrpint(double mrpint) {
        this.mrpint = mrpint;
    }

    public void setWithdrawlimit(double withdrawlimit) {
        this.withdrawlimit = withdrawlimit;
    }

    void addBonus(Bonus b) {
        bonus.add(b);
    }

    @Override
    public double limit() {
        return salary + expense;
    }

    @Override
    public String toString() {
        String b = "";
        for (int i = 0; i < bonus.size(); i++) {
            b += bonus.get(i).toString() + ",";
        }
        return "CreditCard{cardnumber=" + this.getCardnumber() + ", expirydate=" + this.getExpirydate() + ", cvc=" + this.getCvc() + ", limit=" + this.getLimit() + "salary=" + salary + ", expense=" + expense + ", linkedacc=" + linkedacc + ", mrpint=" + mrpint + ", withdrawlimit=" + withdrawlimit + ",Bonus=" + b + '}';
    }

}
