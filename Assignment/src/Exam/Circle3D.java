package Exam;

public class Circle3D extends Circle2D {

    @Override
    double getArea() {
        return super.getArea() * 4;
    }

    double getVolume() {
        return (4 * Math.PI * r * r * r) / 3.0;
    }
}
