package Test;

public class Customer {
    
    private String customerName;
    private String phone;
    private double balance;
    private String simType;
    private double internetBalance;
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void setSimType(String simType) {
        this.simType = simType;
    }
    
    public void setInternetBalance(double internetBalance) {
        this.internetBalance = internetBalance;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getSimType() {
        return simType;
    }
    
    public double getInternetBalance() {
        return internetBalance;
    }
    
}

class Offer {
    
    void calculateOffer(Customer cus) {
        if (cus.getSimType().equalsIgnoreCase("Robi")) {
            cus.setInternetBalance(cus.getInternetBalance() + 50);
        } else if (cus.getSimType().equalsIgnoreCase("Airtel")) {
            
            cus.setBalance(cus.getBalance() + ((cus.getBalance() * 10) / 100.0));
        }
    }
}
