package Assignment;

class Vehicle {

    private int passengers;
    private double maxSpeed;
    private String color;

    public Vehicle(int passengers, double maxSpeed, String color) {
        this.passengers = passengers;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public void setColor() {
        color = "White";
    }

    public String getColor() {
        return color;
    }

    public double findCapacity() {
        return passengers * 75 / (0.20 * maxSpeed);
    }
}
