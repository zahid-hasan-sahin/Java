package newpackage4;

public class Quadrilateral {

    protected int length[] = new int[100];
    protected int width[] = new int[100];
    protected int height[] = new int[100];
    protected int counter = 0;

    protected int getLength(int len) {
        return length[len];
    }

    protected int getWidth(int wid) {
        return width[wid];
    }

    protected int getHeith(int hei) {
        return height[hei];
    }

    protected void setInfo(int len, int wid, int hei) {
        length[counter] = len;
        width[counter] = wid;
        height[counter] = hei;
        ++counter;
    }

}
