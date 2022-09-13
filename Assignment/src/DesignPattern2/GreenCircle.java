package DesignPattern2;

public class GreenCircle implements Circle {

    @Override
    public void drawCircle() {
        System.out.println("Drawing Cirle with Green");
    }

    void fill_green_color() {
        System.out.println("Cirle Filling with Green");
    }

    @Override
    public void draw() {
        fill_green_color();
    }

}
