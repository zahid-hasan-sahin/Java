package admissiontest.problem1;

public class Test {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(4);
        r1.setWidth(5);

        Rectangle r2 = new Rectangle(5.7, 8.1);

        Circle c1 = new Circle();
        c1.setRadius(4.2);
        Circle c2 = new Circle(3);
        System.out.println("Rectangle with sides " + r1.getLength() + " and " + r1.getWidth() + " has area " + r1.computeArea());
        System.out.println("Rectangle with sides " + r2.getLength() + " and " + r2.getWidth() + " has area " + r2.computeArea());
        System.out.println("Circle with radius " + c1.getRadius() + " has area " + c1.computeArea());
        System.out.println("Circle with radius " + c2.getRadius() + " has area " + c2.computeArea());
    }
}
