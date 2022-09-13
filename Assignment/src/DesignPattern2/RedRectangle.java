package DesignPattern2;

public class RedRectangle implements Rectangle {

    @Override
    public void drawRectangle() {
        System.out.println("Drawing Rectangle with Red");
    }

    void fill_red_color() {
        System.out.println("Rectangle Filling with Red");
    }

    @Override
    public void draw() {
        fill_red_color();
    }

}
