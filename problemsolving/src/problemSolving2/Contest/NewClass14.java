package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class NewClass14 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int k = 0;
            ArrayList<Integer> a = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                a.add(scan.nextInt());

            }
            for (int i = 0; i < n; i++) {
                k += a.get(i);
            }
            System.out.println(k  <= m ? k: m);

        }

    }

}
