package CSE110;

public class DebitCard extends ATMCard {

    private int accbalance;

    public DebitCard(int cnum, int cvc, double limit, int accbalance) {
        super(cnum, cvc, limit);
        this.accbalance = accbalance;
    }

    public int getAccbalance() {
        return accbalance;
    }

    public void setAccbalance(int accbalance) {
        this.accbalance = accbalance;
    }

    @Override
    public String toString() {
        return "DebitCard{cardnumber=" + this.getCardnumber() + ", expirydate=" + this.getExpirydate() + ", cvc=" + this.getCvc() + ", limit=" + this.getLimit() + "accbalance=" + accbalance + '}';
    }

    public double limit() {
        return accbalance;
    }
}
