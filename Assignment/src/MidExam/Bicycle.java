package MidExam;

public class Bicycle {

    private int gear_no;
    private double weight;
    private double speed_per_gear;

    Bicycle() {
        weight = 0;
        speed_per_gear = 0.0;
        gear_no = 0;
    }

    Bicycle(int g, double w, double s) {
        this.gear_no = g;
        this.weight = w;
        this.speed_per_gear = s;

    }

    double calculateMaximumSpeed() {
        return 0.4 * weight * speed_per_gear * gear_no;
    }

    void compare(Bicycle ob) {
        if (this.calculateMaximumSpeed() > ob.calculateMaximumSpeed()) {
            System.out.println("Main car is faster");
        } else if (this.calculateMaximumSpeed() < ob.calculateMaximumSpeed()) {
            System.out.println("Main car is Slower");
        } else {
            System.out.println("maximum Speed is same");
        }
    }

}

class Test {

    public static void main(String[] args) {
        Bicycle ob1 = new Bicycle(5, 10.3, 4.8);
        Bicycle ob2 = new Bicycle();
        ob1.compare(ob2);

    }
}
