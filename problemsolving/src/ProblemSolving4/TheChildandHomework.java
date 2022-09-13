package ProblemSolving4;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class TheChildandHomework {

    static class st {

        char s;
        int l;
    }

    static class myCom implements Comparator<st> {

        @Override
        public int compare(st b1, st b2) {
            return b1.l > b2.l ? 1 : -1;
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        TheChildandHomework.st[] ob = new TheChildandHomework.st[4];
        for (int i = 0; i < 4; i++) {
            ob[i] = new st();
            String s = scan.nextLine();
            ob[i].s = (char) ('A' + i);
            ob[i].l = s.length()-2;
            
        }
        Arrays.sort(ob, new myCom());
        if (ob[0].l*2<=ob[1].l && !(ob[2].l*2<=ob[3].l )) {
            System.out.println(ob[0].s);
        }else if(ob[2].l*2<=ob[3].l && !(ob[0].l*2<=ob[1].l)){
            System.out.println(ob[3].s);
        }else{
            System.out.println("C");
        }
    }
}
