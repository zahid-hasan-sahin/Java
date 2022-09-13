package newpackage;

public class Type3 implements Bag {

    Type3() {
        makeOrder();
    }

    @Override
    public void makeOrder() {
        System.out.println("Ordered type3");
    }

}
