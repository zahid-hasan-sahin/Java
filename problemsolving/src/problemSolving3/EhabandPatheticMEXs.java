package problemSolving3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class EhabandPatheticMEXs {

    public class ed {

        int u, v, index;

        public void set(int f, int l, int i) {
            u = f;
            v = l;
            index = i;
        }
    }

    public class mycom implements Comparator<ed> {

        @Override
        public int compare(ed ob1, ed ob2) {
            int f = ob1.v + ob1.u;
            int l = ob2.v + ob2.u;
            return f > l ? 1 : -1;

        }

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        EhabandPatheticMEXs mainOb = new EhabandPatheticMEXs();
        EhabandPatheticMEXs.ed[] ob = new EhabandPatheticMEXs.ed[n - 1];
        for (int i = 0; i < n - 1; i++) {
            ob[i] = mainOb.new ed();
            int x = scan.nextInt();
            int y = scan.nextInt();
            ob[i].set(x, y, i);
        }
        Arrays.sort(ob, mainOb.new mycom());
        int[] res = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            res[ob[i].index] = i;
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.println(res[i]);
        }
    }
}
