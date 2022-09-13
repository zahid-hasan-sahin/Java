package Lab7;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class SavingsAccount extends Account {

    private long credit;
    private Calendar expireDate;

    SavingsAccount() {
        credit = (long) (Math.random() * 10000000000000000L);

        GregorianCalendar gc = new GregorianCalendar();
        int year = 2022 + (int) Math.round(Math.random() * (2030 - 2020));
        gc.set(gc.YEAR, year);
        int dayOfYear = 1 + (int) Math.round(Math.random() * (365 - 1));
        gc.set(gc.DAY_OF_YEAR, dayOfYear);
        expireDate = gc;
    }

    SavingsAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);

        credit = (long) (Math.random() * 10000000000000000L);

        GregorianCalendar gc = new GregorianCalendar();
        int year = 2022 + (int) Math.round(Math.random() * (2030 - 2020));
        gc.set(gc.YEAR, year);
        int dayOfYear = 1 + (int) Math.round(Math.random() * (365 - 1));
        gc.set(gc.DAY_OF_YEAR, dayOfYear);
        expireDate = gc;

    }

    double getCreditBalance() {
        return this.getBalance() * 3;
    }

    public long getCredit() {
        return credit;
    }

    public Calendar getExpireDate() {
        return expireDate;
    }

}
