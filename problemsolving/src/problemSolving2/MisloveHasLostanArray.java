package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class MisloveHasLostanArray {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int l = scan.nextInt();
        int r = scan.nextInt();
        int t = 0;

        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i = 0; i <= n -l; i++) {
            a.add(1);
          
        }
        for (int i = n - l + 1, j = 1; i < n; j++) {
            a.add((int)Math.pow(2, j));
            ++i;
        }
        
        for (int i = 0; i <r; i++) {
            b.add((int)Math.pow(2, i));
          
        }
        for (int i = 0; i < n-r; i++) {
            b.add(b.get(b.size()-1));
        }
        int min= 0,max = 0;
        for (int i = 0; i < n; i++) {
            min +=a.get(i);
            max +=b.get(i);
        }
        System.out.println(min+" "+max);

    }

}
