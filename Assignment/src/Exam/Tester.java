package Exam;

public class Tester {

    public static void main(String[] args) {
        Circle2D ob0 = new Circle2D();
        ob0.r = 5;
        System.out.println(ob0.getArea());
        
        Circle3D ob1 = new Circle3D();
        ob1.r = 10;
        System.out.println(ob1.getArea());
        System.out.println(ob1.getVolume());

        Rectangle2D ob2 = new Rectangle2D();
        ob2.l = 10;
        ob2.w = 20;
        System.out.println(ob2.getArea());

        Rectangle3D ob3 = new Rectangle3D();
        ob3.l = 5;
        ob3.w = 10;
        ob3.h = 15;
        System.out.println(ob3.getArea());
        System.out.println(ob3.getVolume());

    }
}
