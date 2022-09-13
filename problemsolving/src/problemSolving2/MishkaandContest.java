package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class MishkaandContest {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int problems = scan.nextInt();
        int power = scan.nextInt();
        ArrayList<Integer> problemsHardness = new ArrayList<Integer>();
        for (int i = 0; i < problems; i++) {
            problemsHardness.add(scan.nextInt());
        }
        int res = 0;
        for (int i = 0; i < problemsHardness.size(); i++) {
            if (problemsHardness.get(i)> power) {
                break;
            } else {
                problemsHardness.remove(i);
                ++res;
                --i;
            }
        }
        
        for (int i = problemsHardness.size() - 1; i >= 0; i--) {
            if (problemsHardness.get(i) > power) {
                break;
            } else {
                problemsHardness.remove(i);
                ++res;
            }
        }
        System.out.println(res);

    }

}
