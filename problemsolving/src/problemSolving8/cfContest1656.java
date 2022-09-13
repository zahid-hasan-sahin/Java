package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class cfContest1656 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                a.add(scan.nextInt());
            }
            int c = 0;
            int ev = 0;
            int od = 0;
            for (int i = 0; i < n; i++) {
                if (a.get(i) == a.get(0)) {
                    ++c;
                }
                if (a.get(i) % 2 == 0) {
                    ++ev;
                } else {
                    ++od;
                }
            }

            if (c == n || ev == n || od == n) {
                sb.append("YES\n");
                continue k;
            }
            boolean o = false;

            for (int i = 0; i < n; i++) {

                if (a.get(i) == 1) {
                    o = true;
                }

            }

            if (o) {
                Collections.sort(a);
                for (int i = 0; i < n - 1; i++) {
                    if (a.get(i) + 1 == a.get(i + 1)) {
                        sb.append("No\n");
                        continue k;
                    }
                }
                sb.append("YES\n");
            } else {
                sb.append("YES\n");
            }

        }
        System.out.println(sb);
    }
}
