package midExam2;

public class RigthTriangle extends GeometricShape {

    private int height;

    public RigthTriangle(Point location, int height) {
        super(location);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    void draw() {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }

    public String toString() {
        return height + "";
    }

}
