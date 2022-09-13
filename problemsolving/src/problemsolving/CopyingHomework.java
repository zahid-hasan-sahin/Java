package problemsolving;

import java.util.ArrayList;
import java.util.Scanner;

public class CopyingHomework {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] val = new int[n];

        for (int i = 0; i < n; i++) {
            val[i] = scan.nextInt();
        }
        int sum = 0;
        ArrayList<Integer> array = new ArrayList<Integer>();
        while (sum <= n) {
            for (int i = 0; i < n; i++) {
                array.add(val[i]);
            }
        }
    }

}
