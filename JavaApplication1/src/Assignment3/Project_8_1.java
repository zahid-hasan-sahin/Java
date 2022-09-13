package Assignment3;

interface ShapeInterface {

    /**
     * Sets the offset for the shape.
     */
    public void setOffset(int newOffset);

    /**
     * Returns the offset for the shape.
     */
    public int getOffset();

    /**
     * Draws the shape at lineNumber lines down from the current line.
     */
    public void drawAt(int lineNumber);

    /**
     * Draws the shape at the current line.
     */
    public void drawHere();
}

/**
 * Class for drawing simple shapes on the screen using keyboard characters. This
 * class will draw an asterisk on the screen as a test. It is not intended to
 * create a "real" shape, but rather to be used as a base class for other
 * classes of shapes.
 */
class ShapeBasics implements ShapeInterface {

    private int offset;

    public ShapeBasics() {
        offset = 0;
    }

    public ShapeBasics(int theOffset) {
        offset = theOffset;
    }

    public void setOffset(int newOffset) {
        offset = newOffset;
    }

    public int getOffset() {
        return offset;
    }

    public void drawAt(int lineNumber) {
        for (int count = 0; count < lineNumber; count++) {
            System.out.println();
        }
        drawHere();
    }

    public void drawHere() {
        for (int count = 0; count < offset; count++) {
            System.out.print(' ');
        }
        System.out.println('*');
    }
}

class Diamond extends ShapeBasics {

    public Diamond(int theOffset) {
        super(theOffset);
    }

    static void skipSpaces() {
        Diamond ob = new Diamond(10);
        ob.drawHere();
    }
}

class Tester {

    public static void main(String[] args) {
        Diamond.skipSpaces();
    }
}
