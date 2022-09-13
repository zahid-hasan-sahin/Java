package CSE110;

public class Bonus {

    private String bonustype;
    private double amount;

    public Bonus(String bonustype, double amount) {
        this.bonustype = bonustype;
        this.amount = amount;
    }

    public void setBonustype(String bonustype) {
        this.bonustype = bonustype;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getBonustype() {
        return bonustype;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Bonus{" + "bonustype=" + bonustype + ", amount=" + amount + '}';
    }

}
