package CSE;

public class Vehicle implements Comparable {
    
    private String vehiclename;
    private int mileage;
    private int capacity;
    
    public Vehicle(String vehiclename, int mileage, int capacity) {
        this.vehiclename = vehiclename;
        this.mileage = mileage;
        this.capacity = capacity;
    }
    
    public String getVehiclename() {
        return vehiclename;
    }
    
    public int getMileage() {
        return mileage;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public void setVehiclename(String vehiclename) {
        this.vehiclename = vehiclename;
    }
    
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    @Override
    public int compareTo(Object other) {
        Vehicle ob = (Vehicle) other;
        return this.getVehiclename().compareTo(ob.getVehiclename());
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicle{");
        sb.append("vehiclename=").append(vehiclename);
        sb.append(", mileage=").append(mileage);
        sb.append(", capacity=").append(capacity);
        sb.append('}');
        return sb.toString();
    }
    
}
