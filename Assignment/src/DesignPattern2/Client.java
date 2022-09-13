package DesignPattern2;

public class Client {

    public static void main(String[] args) {
        ShapeMaker a = new ShapeMaker(new GreenCircle());
        ShapeMaker b = new ShapeMaker(new RedCircle());
        ShapeMaker c = new ShapeMaker(new RedTriangle());
        ShapeMaker d = new ShapeMaker(new GreenTriangle());
        ShapeMaker e = new ShapeMaker(new RedRectangle());
        ShapeMaker f = new ShapeMaker(new GreenRectangle());
    }
}
