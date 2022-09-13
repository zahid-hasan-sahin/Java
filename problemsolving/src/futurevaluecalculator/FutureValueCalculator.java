package futurevaluecalculator;

public class FutureValueCalculator {

    private double monthlyInvestment;
    private double yearlyInterestRate;
    private int years;
    private int months;

    FutureValueCalculator() {
        monthlyInvestment = 0;
        yearlyInterestRate = 0;
        years = 0;
        months = 0;
    }

    public double calculate() {
        double monthlyInterestRate = yearlyInterestRate / 12 / 100;
        int months = years * 12;

        double futureValue = 0;
        int i = 1;
        while (i <= months) {
            futureValue = futureValue + monthlyInvestment;
            double monthlyInterestAmount = futureValue * monthlyInterestRate;
            futureValue = futureValue + monthlyInterestAmount;
            i = i + 1;

        }
        return futureValue;
    }

    public void setMonthlyInvestment(double monthlyInvestment) {
        this.monthlyInvestment = monthlyInvestment;
    }

    public void setYearlyInterestRate(double yearlyInterestRate) {
        this.yearlyInterestRate = yearlyInterestRate;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public double getMonthlyInvestment() {
        return monthlyInvestment;
    }

    public double getYearlyInterestRate() {
        return yearlyInterestRate;
    }

    public int getYears() {
        return years;
    }

    public int getMonths() {
        return months;
    }

}
