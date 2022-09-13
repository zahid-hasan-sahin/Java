package finalexam;

import java.text.DecimalFormat;

public class CannedFood extends Groceries {

    private String expiredDate;
    private String type;

    CannedFood(String description, double price, String expiredDate, String type) {
        super(description, price);
        this.expiredDate = expiredDate;
        this.type = type;
    }

    @Override
    String displayInfo() {
        DecimalFormat df = new DecimalFormat("#.##");
        String res = "Grocery description: " + getDescription() + "\n"
                + "Canned Food Type: " + this.type + "\n"
                + "Expiry date: " + this.expiredDate + "\n"
                + "Price: USD " + df.format(getPrice()) + "\n"
                + "Price converted to Malaysian: MYR " + df.format(calcPriceInMYR()) + "\n";
        return res;
    }
}
