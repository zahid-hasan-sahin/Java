package Assignment;

public class square {

    private int length;

    public void set_length(int lenght) {
        this.length = length;
    }

    int area(square ob) {
        return length * length;
    }

}

class Tester {

    public static void main(String[] args) {
        square ob = new square();
        ob.set_length(10);

        square test = new square();
        int res = test.area(ob);
        System.out.println(res);
    }
}
