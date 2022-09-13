package Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

/**
 *
 * @author sabir
 */
public class InvoiceCalculator {

    private double subtotal;
    private double discountPercent;
    private double discountAmount;
    private double totalBeforeTax;
    final double SALES_TAX_PCT = .05;
    private double salesTax;
    private double total;

    void setSubTotal(String subtotalLine) {
        subtotal = new BigDecimal(subtotalLine).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    void calculateDiscountPercent() {
        if (subtotal >= 200) {
            discountPercent = .2;
        } else if (subtotal >= 100) {
            discountPercent = .1;
        } else {
            discountPercent = 0;
        }
    }

    void calculateDiscoundAmount() {
        discountAmount = subtotal * discountPercent;
        discountAmount = new BigDecimal(discountAmount).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    void calculatetotalBeforeTax() {
        totalBeforeTax = subtotal - discountAmount;
    }

    void calculateSalesTax() {
        salesTax = SALES_TAX_PCT * totalBeforeTax;
        salesTax = new BigDecimal(salesTax).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    void calculateTotal() {
        total = totalBeforeTax + salesTax;
    }

    void output() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        String message = "\nINVOICE\n"
                + "subtotal     Discount percent    Discount amount     Total before tax    Sales tax   Invoice total";
        String border = "========     ================    ===============     ================    =========   =============";
        String res = currency.format(subtotal) + "       "
                + percent.format(discountPercent) + "                 "
                + currency.format(discountAmount) + "             "
                + currency.format(totalBeforeTax) + "             "
                + currency.format(salesTax) + "       "
                + currency.format(total);
        System.out.println(message);
        System.out.println(border);
        System.out.println(res);
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public double getTotalBeforeTax() {
        return totalBeforeTax;
    }

    public double getSALES_TAX_PCT() {
        return SALES_TAX_PCT;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public double getTotal() {
        return total;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public void setTotalBeforeTax(double totalBeforeTax) {
        this.totalBeforeTax = totalBeforeTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
