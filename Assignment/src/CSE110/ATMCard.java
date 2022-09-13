package CSE110;

import java.util.Calendar;

abstract public class ATMCard {

    private int cardnumber;
    private Calendar expirydate;
    private int cvc;
    private double limit;

    ATMCard(int cnum, int cvc, double limit) {
        this.cardnumber = cnum;
        this.cvc = cvc;
        this.limit = limit;
    }

    public int getCardnumber() {
        return cardnumber;
    }

    public Calendar getExpirydate() {
        return expirydate;
    }

    public int getCvc() {
        return cvc;
    }

    public double getLimit() {
        return limit;
    }

    public void setCardnumber(int cardnumber) {
        this.cardnumber = cardnumber;
    }

    public void setExpirydate(Calendar expirydate) {
        this.expirydate = expirydate;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    abstract public String toString();

    abstract public double limit();
}
