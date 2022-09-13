package DesignPattern2;

public class GreenTriangle implements Triangle {

    @Override
    public void drawTriangle() {
        System.out.println("Drawing traingle with Green");
    }

    void fill_green_color() {
        System.out.println("tringale Filling with green");
    }

    @Override
    public void draw() {
        fill_green_color() ;
    }

}
