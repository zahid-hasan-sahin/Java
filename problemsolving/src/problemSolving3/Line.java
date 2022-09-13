package problemSolving3;

import java.util.Scanner;

public class Line {

    public static void main(String agrs[]) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=9; j++) {
                System.out.println(i+"x"+j+"="+(i*j));
            }
        }


    }

}
