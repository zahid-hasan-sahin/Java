package Exam;

public class Rectangle3D extends Rectangle2D {

    double h;

    @Override
    double getArea() {
        return 2 * (l * w + w * h + h * l);
    }

    double getVolume() {
        return super.getArea() * h;
    }
}
