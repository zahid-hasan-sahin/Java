package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class TheRank {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> studentTotalScore = new ArrayList<Integer>();
        while (n-- > 0) {
            int sumOfScore = 0;
            ArrayList<Integer> studentScore = new ArrayList<Integer>();
            for (int i = 0; i < 4; i++) {
                studentScore.add(scan.nextInt());
                sumOfScore += studentScore.get(i);
            }
            studentTotalScore.add(sumOfScore);
        }
        int smithTotalScore = studentTotalScore.get(0);
        int smithPos = 1;
        for (int i = 1; i < studentTotalScore.size(); i++) {
            if(studentTotalScore.get(i)>smithTotalScore){
                ++smithPos;
            }
        }
        System.out.println(smithPos);

    }
}
