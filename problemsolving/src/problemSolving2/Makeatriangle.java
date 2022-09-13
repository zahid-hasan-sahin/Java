package problemSolving2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Makeatriangle {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> sticklen = new ArrayList<Integer>();
        for (int i = 0; i <= 2; i++) {
            sticklen.add(scan.nextInt());
        }
        Collections.sort(sticklen);
        System.out.println(sticklen.get(2) - (sticklen.get(0) + sticklen.get(1)) >= 0 ? sticklen.get(2) - (sticklen.get(0) + sticklen.get(1)) + 1 : 0);

    }

}
