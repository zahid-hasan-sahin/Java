package Java_stream;

public class Demo {

    public static void main(String args[]) {
        int a = 4;
        int b = 5;
        Demo d = new Demo();
        d.addNumbers(a,() -> System.out.println(a+b));

    }

    public void addNumbers(int i, inter var) {
        var.add();
    }
}

interface inter {

    void add();
}
