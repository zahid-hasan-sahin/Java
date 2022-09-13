package Decorator;

public class SuperBike extends BikeDecorator{

    SuperBike(Bike bike) {
        super(bike);
    }

    @Override
    public void BikeType() {
        super.BikeType();
        System.out.println("Super Bike");
    }

}
