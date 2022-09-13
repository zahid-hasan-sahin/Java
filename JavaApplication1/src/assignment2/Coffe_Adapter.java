package assignment2;

//extending and implmenet TeaMaker interface
public class Coffe_Adapter extends CoffeeMaker implements TeaMaker {

    Coffe_Adapter(CoffeeMaker e) {
        //making Coffee
        e.makeCoffee();
    }

    //making tea
    @Override
    public void makeTea() {

    }

}
