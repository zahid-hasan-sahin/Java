package newpackage4;

import java.util.Scanner;

public class Rectangle {

    Quadrilateral ob = new Quadrilateral();

    void isDimensionExists() {
        int n = ob.counter;
        for (int i = 0; i < n; i++) {
            if (ob.getLength(i) + ob.getWidth(i) + ob.getHeith(i) > 12) {
                System.out.println(i);
            }
        }
    }

    void Reatangle(int height) {
        int n = ob.counter;
        for (int i = 0; i < n; i++) {
            if (ob.getHeith(i) == height) {
                System.out.println("Legth=" + ob.getLength(n));
                System.out.println("Width=" + ob.getWidth(n));
                System.out.println("Heith=" + ob.getHeith(n));
            }
        }
    }

    void setReactangleInfo() {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();
        ob.setInfo(l, w, h);
    }

    int getReatangleVolume(int n) {
        return ob.getHeith(n) * ob.getLength(n) * ob.getWidth(n);
    }

    void getHighstVolume() {
        int n = ob.counter;
        int m = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int k = ob.getHeith(i) * ob.getLength(i) * ob.getWidth(i);
            if (k > m) {
                m = k;
                res = i;
            }
        }
        System.out.println("Legth=" + ob.getLength(res));
        System.out.println("Width=" + ob.getWidth(res));
        System.out.println("Heith=" + ob.getHeith(res));
    }

}
