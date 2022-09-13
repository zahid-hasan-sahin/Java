package midExam2;

public class GeometricShape {

    private Point location;

    GeometricShape(Point location) {
        this.location = location;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    double distance(GeometricShape shape) {
        return Math.sqrt(Math.pow(location.getX() - shape.location.getX(), 2) + Math.pow(location.getY() - shape.location.getY(), 2));
    }

    void draw() {
        System.out.println("Geometric Shape ");
    }

    @Override
    public String toString() {
        return location.getX() + " " + location.getY();
    }

}
