package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class PointsinSegments {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int totalSegment = scan.nextInt();
        int maxSegmentValue = scan.nextInt();
        ArrayList<Boolean> res = new ArrayList<Boolean>();
        for (int i = 0; i < maxSegmentValue; i++) {
            res.add(true);
        }
        int underSeg = 0;
        for (int i = 0; i < totalSegment; i++) {
            int start = scan.nextInt();
            int end = scan.nextInt();
            for (int j = start; j <= end; j++) {
                res.set(j - 1, false);

            }
        }
        for (int i = 0; i < res.size(); i++) {
            if (res.get(i) == false) {
                ++underSeg;
            }
        }
        System.out.println(res.size() - underSeg);
        for (int i = 0; i < res.size(); i++) {
            if (res.get(i) == true) {
                System.out.print(i + 1 + " ");
            }

        }
        System.out.println();

    }

}
