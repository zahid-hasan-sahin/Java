package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class JzzhuandChildren {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        ArrayList<Integer> pos = new ArrayList<Integer>();
        int div = 0;
        int p = 0;
        for (int i = 0; i < n; i++) {
            int t = scan.nextInt();
            if(t%m==0){
                --t;
            }
            if (t / m >= div) {
                div = t / m;
                p = i + 1;

            }
        }
        System.out.println(p);
        ArrayList<Integer> y = new ArrayList<Integer>();
        y.add(5);
        y.add(10);
        y.add(5);
    
    }

}
