package dp;

import java.util.ArrayList;
import java.util.Scanner;

public class subSetPrint {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        long t = 1 << ar.size();

        for (long i = 0; i < t; i++) {
            for (long j = 0; j < ar.size(); j++) {
                long p = 1 << j;
                if ((i & p) != 0) {
                    // System.out.println(p + " " + j);
                    System.out.print(ar.get((int) j) + " ");
                }
            }
            System.out.println();
        }
    }

}
