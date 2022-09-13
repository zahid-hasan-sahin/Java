package Exam;

public class Circle2D extends Shape {

    double r;

    @Override
    double getArea() {
        return Math.PI * r * r;
    }
}
