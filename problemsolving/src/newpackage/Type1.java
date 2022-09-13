package newpackage;

public class Type1 implements Bag {

    Type1() {
        makeOrder();
    }

    @Override
    public void makeOrder() {
        System.out.println("Ordered type1");
    }

}
