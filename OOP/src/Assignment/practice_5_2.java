package Assignment;

class Counter {

    private int c;

    void setToZero() {
        c = 0;
    }

    void increase() {
        ++c;
    }

    void decrease() {
        if (c == 0) {
            System.out.println("Not Possible ");
            return;
        }
        --c;
    }

    int getCount() {
        return c;
    }
}

class Tester2 {

    public static void main(String[] args) {

        Counter ob = new Counter();
        ob.setToZero();
        ob.increase();
        System.out.println(ob.getCount());
        ob.decrease();
        ob.decrease();
        System.out.println(ob.getCount());
        ob.increase();
        ob.increase();
        ob.increase();
        System.out.println(ob.getCount());
        ob.setToZero();
        System.out.println(ob.getCount());
    }
}
