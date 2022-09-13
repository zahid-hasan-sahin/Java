package ProblemSolving5;

import java.util.Scanner;

public class LittleElephantandRozdil {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int mn = Integer.MAX_VALUE;
        int c = 0;
        int p = 0;
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            if (mn > in) {
                mn = in;
                c = 0;
                p = i;
            }
            if (mn == in) {
                ++c;
            }
        }
       
        if (c == 1) {
            System.out.println(p + 1);
        } else {
            System.out.println("Still Rozdil");
        }
    }

}
