package DesingPattern;

public class TeaMaker implements Maker {

    TeaMaker(CoffeeMaker ob) {
        ob.make();
    }

    TeaMaker(TeaMaker ob) {
        ob.make();
    }

    TeaMaker() {
        make();
    }

    @Override
    public void make() {
        System.out.println("Making Tea");
    }

}
