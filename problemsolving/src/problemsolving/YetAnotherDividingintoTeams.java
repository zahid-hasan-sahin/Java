package problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class YetAnotherDividingintoTeams {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int loop = scan.nextInt();
        int t = loop;
        while (t > 0) {
            int total = scan.nextInt();
            ArrayList<Integer> val = new ArrayList<Integer>();
            for (int i = 0; i < total; i++) {
                val.add(scan.nextInt());
            }
            int c = 0;
            Collections.sort(val);
            for (int i = 0; i < total - 1; i++) {
                if (val.get(i + 1) - val.get(i) <= 1) {

                    c++;
                    break;
                }
            }
            if (c > 0) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }

            t--;
            c = 0;
        }
    }

}
