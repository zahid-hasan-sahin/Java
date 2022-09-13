package MidTerm;

public class Customer {

    int cusId;
    String name;

    Customer(int cusId, String name) {
        this.cusId = cusId;
        this.name = name;
    }

    public int getCusId() {
        return cusId;
    }

    public String getName() {
        return name;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return cusId + " " + name;
    }
}
