package Decorator;

public class Client {

    public static void main(String[] args) {
        Bike ob1 = new SuperBike(new NoramlBike());
        ob1.BikeType();
        Bike ob2 = new ClassicBike(new SuperBike(new NoramlBike()));
        ob2.BikeType();
    }
}
