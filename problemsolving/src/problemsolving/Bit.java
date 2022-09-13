package problemsolving;

import java.util.ArrayList;
import java.util.Scanner;

public class Bit{

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        ArrayList<String> s = new ArrayList<String>();
        for (int i = 0; i < total; i++) {
            s.add(scan.next());

        }
        int X = 0;
        for (int i = 0; i < total; i++) {
            if (s.get(i).equals("X++")) {
                X++;
            } else if (s.get(i).equals("X--")) {
                X--;
            } else if (s.get(i).equals("--X")) {
                --X;
            } else if (s.get(i).equals("++X")) {
                ++X;
            }

        }
        System.out.println(X);

    }

}
