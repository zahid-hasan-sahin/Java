package CSE1101;

public class bicycle implements Vehicle {

    int speed;
    int gear;

    @Override
    public void changeGear(int a) {
        gear = a;
    }

    @Override
    public void speedUp(int a) {
        speed += a;
    }

    @Override
    public void applyBrakes(int a) {
        speed -= a;
    }

    @Override
    public String toString() {
        return "bicycle{" + "speed=" + speed + ", gear=" + gear + '}';
    }
}
