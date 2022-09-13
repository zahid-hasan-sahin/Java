package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class MotaracBirthday {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int r = 0;
            int e = Integer.MIN_VALUE;
            int y = -1;
            ArrayList<Integer> v = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                if (in == 1) {
                    ++y;
                }
                if (y == i) {
                    v.add(0);
                } else {
                    v.add(in);
                    if (in != -1) {
                        ++r;
                    } else {
                        r = 0;
                    }
                    if (r >= 2) {

                        e = Math.max(e, Math.abs(v.get(v.size() - 1) - v.get(v.size() - 2)));
                    }
                }
            }
            int mx = Integer.MIN_VALUE;
            int f = 0;
            int l = 0;
            if (v.size() == 0) {
                System.out.println(0 + " " + 0 + "\n");
            } else if (v.size() == 1) {
                System.out.println(0 + " " + v.get(0) + "\n");
            } else {

                for (int i = 1; i < v.size() - 1; i++) {

                    if (v.get(i) == -1) {
                        if (Math.abs(v.get(i + 1) - v.get(i - 1)) > mx) {
                            f = v.get(i - 1);
                            l = v.get(i + 1);
                            mx = Math.abs(v.get(i + 1) - v.get(i - 1));
                        }
                    }

                }
                System.out.println(Math.max((int) Math.ceil(mx / 2.0), e) + " " + Math.max(Math.abs(l - (mx / 2)), Math.abs((mx / 2) - f)) + "\n");
            }
        }
        System.out.println(sb);
    }

}
