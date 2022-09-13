package midExam2;

public class Main {
    
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 7);
        Square sq = new Square(p1, 5);
        RigthTriangle rt = new RigthTriangle(p2, 7);
        sq.draw();
        rt.draw();
        System.out.println(sq.distance(rt));
        
    }
}
