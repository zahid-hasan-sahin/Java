package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class NestedSegments {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<st> a = new ArrayList<st>();
        int[] l = new int[n];
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            st ob = new st();
            ob.l = scan.nextInt();
            ob.r = scan.nextInt();
            l[i] = ob.l;
            r[i] = ob.r;
            a.add(ob);
        }
        Collections.sort(a, new myCom());
        int fr = -1;
        int fl = -1;
        int lr = -1;
        int ll = -1;
        for (int i = 0; i < n; i++) {
            if (fr >= a.get(i).r) {
                ll = a.get(i).l;
                lr = a.get(i).r;

                break;
            }
            if (fr < a.get(i).r) {
                fr = a.get(i).r;
                fl = a.get(i).l;
            }
        }
        int o = -1;
        int t = -1;
        
        for (int i = 0; i < n; i++) {
            if (l[i] == fl && r[i] == fr) {
                o = i + 1;
            }
            if (ll == l[i] && r[i] == lr) {
                t = i + 1;
            }
        }
        if (o == t) {
            for (int i = 0; i < n; i++) {
                if (i + 1 != o && ll == l[i] && r[i] == lr) {
                    t = i + 1;
                }
            }
        }
        if (o == -1 || t == -1) {
            System.out.println("-1 -1");
        } else {
            System.out.println(t + " " + o);
        }

    }
}

class st {

    int l, r;

}

class myCom implements Comparator<st> {

    @Override
    public int compare(st ob1, st ob2) {
        int f = ob1.l;
        int l = ob2.l;
        if (f == l) {
            return ob2.r - ob1.r;
        }
        return f - l;

    }

}
