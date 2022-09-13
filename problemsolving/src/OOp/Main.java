package OOp;

public class Main {

    public static void main(String[] args) {
        Person sabbir = new Person("sabbir", 20);
        sabbir.details();

        Person zahid = new Person(sabbir);
        zahid.details();

        Person sahin = new Person(zahid);
        sahin.details();

    }
}
