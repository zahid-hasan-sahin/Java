package DesignPattern2;

public class GreenRectangle implements Rectangle {

    @Override
    public void drawRectangle() {
        System.out.println("Drawing Rectangle with Green");
    }

    void fill_green_color() {
        System.out.println("Rectangle Filling with green");
    }

    @Override
    public void draw() {
        fill_green_color();
    }

}
