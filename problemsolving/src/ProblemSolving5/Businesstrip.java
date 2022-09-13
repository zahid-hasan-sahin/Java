package ProblemSolving5;

import java.util.Arrays;
import java.util.Scanner;

public class Businesstrip {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int[] a = new int[12];
        for (int i = 0; i < 12; i++) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        int s = 0;
        boolean b = true;
        int i = 11;
        
        for (i = 11; i >= 0; i--) {           
            s += a[i];
            if (s >= k) {
                b = false;
                break;
            }
        }
        if(k==0){
            ++i;
        }
        if (!b) {
            System.out.println(12 - i);
        } else {
            System.out.println("-1");
        }

    }

}
