package newpackage;

public class Type2 implements Bag {

    Type2() {
        makeOrder();
    }

    @Override
    public void makeOrder() {
        System.out.println("Ordered type2");
    }

}
