package assignment2;

public class Client {

    public static void main(String[] args) {
        //making TeaMaker class object with 
        TeaMaker t1 = new Coffe_Adapter(new CoffeeMaker());
        t1.makeTea();
    }

}
