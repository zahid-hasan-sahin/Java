package ProblemSolving4;

import java.util.ArrayList;
import java.util.Scanner;

public class Chocolate {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        ArrayList<Integer> a = new ArrayList<Integer>();
       
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            if (in == 1) {
                a.add(i);
            }
        }
        if(a.size()==0){
            System.out.println("0");
            return;
        }
        if(a.size()==1){
            System.out.println(1);
            return ;
        }
        long res = 1;
       
        for (int i = 0; i < a.size() - 1; i++) {
            res *= (a.get(i + 1) - a.get(i));
        }
        System.out.println(res);
    }

}
