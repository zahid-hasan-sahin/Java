package MidTerm;

public class Teller {

    int id;
    String date;
    static int slotId;
    String customerInfo;

    Teller(int id, String date, String customerInfo) {
        this.id = id;
        this.date = date;
        this.customerInfo = customerInfo;
    }

    public String toString() {
        return id + " " + date + " "
                + slotId + " "
                + customerInfo;
    }

    void addcustomer(Customer c) {
        if (slotId >= 10) {
            System.out.println("slots are not available");
        } else {
            ++slotId;
            customerInfo += c.getCusId() + " " + c.getName() + "\n";
        }
    }

}
