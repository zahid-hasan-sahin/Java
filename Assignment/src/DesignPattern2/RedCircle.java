package DesignPattern2;

public class RedCircle implements Circle {

    @Override
    public void drawCircle() {
        System.out.println("Drawing Cirle with Red");
    }

    void fill_red_color() {
        System.out.println("Cirle Filling with Red");
    }

    @Override
    public void draw() {
        fill_red_color();
    }
}
