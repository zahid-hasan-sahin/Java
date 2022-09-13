package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StasandtheQueueattheBuffet {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        ArrayList<stu> ar = new ArrayList<stu>();
        for (int i = 1; i <= n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            stu ob = new stu();
            ob.a = a;
            ob.b = b;
            ob.ind = i;
            ob.diff = a - b;
            ar.add(ob);
        }
        Collections.sort(ar, new myCom());
        long res = 0;
        for (long i = 1; i <= n; i++) {
            stu ob = ar.get((int) i - 1);
            res += (ob.a * i) - (ob.b * i) - ob.a + (ob.b * n);
        }
        System.out.println(res);
    }

}

class myCom implements Comparator<stu> {

    @Override
    public int compare(stu a, stu b) {
        if (a.diff < b.diff) {
            return 1;
        } else if (a.diff > b.diff) {
            return -1;
        } else {
            return 0;
        }
    }

}

class stu {

    long a;
    long b;
    int ind;
    long diff;

}
