package midExam2;

public class Square extends GeometricShape {

    private int side;

    public Square(Point location, int side) {
        super(location);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    void draw() {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }

    public String toString() {
        return side + "";
    }

}
