package CSE1105;

public class Main {

    public static void main(String[] args) {
        try {
            Account<String> ob = new Account<String>("Bank1", 0, 20);
            ob.setDeposite(100);
            System.out.println(ob.toString());
            ob.setWithdraw(-10);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
