package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class BearandFindingCriminals {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        ArrayList<Integer> pos = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pos.add(scan.nextInt());
        }

        int ct = 0;
        if (pos.get(k - 1) == 1) {
            ++ct;
        }

        int p = 1, m = 1;
        while (true) {
            if (k - m <= 0 || k + p > pos.size()) {
                break;
            }
            if (pos.get(k - m - 1) == 1 && pos.get(k + p - 1) == 1) {
                ct += 2;
            }
            ++m;
            ++p;
        }
        for (int i = k + p - 1; i < pos.size(); i++) {
            if (pos.get(i) == 1) {
                ++ct;
            }
        }
        for (int i = k - m - 1; i >= 0; i--) {
            if (pos.get(i) == 1) {
                ++ct;
            }
        }
        System.out.println(ct);

    }
}
