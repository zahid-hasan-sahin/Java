package Assignment;

class Color {

    void doColor() {
        System.out.println("Coloring with color");
    }
}

class Red extends Color {

    void doColor() {
        System.out.println("Coloring with Red");
    }
}

public class Client {

    public static void main(String[] args) {
        Color v = new Red();
        v.doColor();
    }
}
