package newpackage12;

public class Test<T> {

    public static void main(String args[]) {
        A a = new A();
        a.set(9);
        System.out.println(a);
    }
}

class A {

    int t = 3;

    void set(int t) {
        System.out.println(this);
    }
}
