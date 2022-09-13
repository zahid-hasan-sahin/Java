package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class YetAnotherArrayPartitioningTask {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();
        ArrayList<st> a = new ArrayList<st>();
        for (int i = 0; i < n; i++) {
            st in = new st();
            in.ind = i;
            in.val = scan.nextInt();
            a.add(in);
        }
        Collections.sort(a, new myCom());
        long res = 0;
        for (int i = 0; i < m * k; i++) {
            res += a.get(i).val;
        }
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = 0; i < m * k; i++) {
            ar.add(a.get(i).ind);
        }
        Collections.sort(ar);
        System.out.println(res);

        for (int i = m; i < ar.size(); i += m) {
            System.out.print((ar.get(i - 1) + 1) + " ");
        }

        System.out.println();

    }
}

class st {

    int val, ind;

}

class myCom implements Comparator<st> {

    @Override
    public int compare(st ob1, st ob2) {
        int f = ob1.val;
        int l = ob2.val;
        return l - f;

    }

}
