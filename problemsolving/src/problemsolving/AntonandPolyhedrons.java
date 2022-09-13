package problemsolving;

import java.util.Scanner;

public class AntonandPolyhedrons {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int r = 0;
        for (int j = 0; j < total; j++) {
            String s = scan.next();
            if (s.equals("Tetrahedron")) {
                r = r + 4;
            } else if (s.equals("Cube")) {
                r = r + 6;
            } else if (s.equals("Octahedron")) {
                r = r + 8;

            } else if (s.equals("Dodecahedron")) {
                r = r + 12;
            } else if (s.equals("Icosahedron")) {
                r = r + 20;
            }
        }
        System.out.println(r);

    }
}
