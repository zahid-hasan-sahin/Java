package problemSolving8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class cfContest1657 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long c = scan.nextLong();
        ArrayList<Man> man = new ArrayList<Man>();
        ArrayList<Robot> rob = new ArrayList<Robot>();
        for (int i = 0; i < n; i++) {
            long x = scan.nextLong();
            long y = scan.nextLong();
            long z = scan.nextLong();
            Man ob = new Man();
            ob.cost = x;
            ob.attack = y;
            ob.health = z;
            man.add(ob);
        }
        int m = scan.nextInt();
        for (int i = 0; i < m; i++) {
            long x = scan.nextLong();
            long y = scan.nextLong();
            Robot ob = new Robot();
            ob.attack = x;
            ob.health = y;
            ob.ind = i;
            rob.add(ob);

        }
        long[] result = new long[m + 1];
        Collections.sort(man, new sortMan());
        Collections.sort(rob, new sortRobot());
        int ind = 0;
        for (int i = 0; i < m; i++) {
            Robot r = rob.get(i);
            boolean b = false;
            while (ind < n) {
                Man p = man.get(ind);
                long left = 1;
                long right = 1000000000001l;
                long min = Long.MAX_VALUE;
                while (left <= right) {
                    long mid = (left + right) / 2;
                    long res = (p.attack * mid);
                  
                    if (((double) p.health / r.attack) > ((double) r.health / res)) {
                        min = Math.min(min, mid);
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }

                }

                if (p.cost * min < c) {
                    result[r.ind] = p.cost * min;
                    b = true;
                    break;
                } else {
                    ++ind;
                }

            }
            if (!b) {
                result[r.ind] = -1;
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}

class sortMan implements Comparator<Man> {

    @Override
    public int compare(Man a, Man b) {
        return (int) a.cost - (int) b.cost;
    }

}

class sortRobot implements Comparator<Robot> {

    @Override
    public int compare(Robot a, Robot b) {
        return (int) a.attack - (int) b.attack;
    }

}

class Man {

    long cost;
    long health;
    long attack;
}

class Robot {

    long health;
    long attack;
    int ind;
}
