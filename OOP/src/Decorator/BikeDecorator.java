package Decorator;

public class BikeDecorator implements Bike {

    private Bike bike;

    BikeDecorator(Bike bike) {
        super();
        this.bike = bike;
    }

    @Override
    public void BikeType() {
        bike.BikeType();
    }
}
