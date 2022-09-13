package Decorator;

public class ClassicBike extends BikeDecorator {

    ClassicBike(Bike bike) {
        super(bike);
    }

    @Override
    public void BikeType() {
        super.BikeType();
        System.out.println("Classic Bike");
    }

}
