package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StableGroups {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long k = scan.nextLong();
        long x = scan.nextLong();
        ArrayList<Long> a = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            a.add(scan.nextLong());
        }
        Collections.sort(a);
        ArrayList<Long> diff = new ArrayList<Long>();
        for (int i = 0; i < n - 1; i++) {
            diff.add(a.get(i + 1) - a.get(i));
        }

        Collections.sort(diff);

        long res = 0;
       
        for (int i = 0; i < diff.size(); i++) {
            if (diff.get(i) > x) {
                for (int j = i; j < diff.size(); j++) {
                    long need = (long) Math.ceil((double) diff.get(j) / x) - 1;

                    if (k >= need) {

                        k -= need;
                    } else {
                        for (int l = j; l < diff.size(); l++) {
                            ++res;
                        }
                        break;
                    }
                }
                break;
            }
        }
        System.out.println(res + 1);

    }

}
