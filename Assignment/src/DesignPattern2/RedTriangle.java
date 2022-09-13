package DesignPattern2;

public class RedTriangle implements Triangle {

    @Override
    public void drawTriangle() {
        System.out.println("Drawing traingle with Red");
    }

    void fill_red_color() {
        System.out.println("tringale Filling with Red");
    }

    @Override
    public void draw() {
        fill_red_color();
    }

}
