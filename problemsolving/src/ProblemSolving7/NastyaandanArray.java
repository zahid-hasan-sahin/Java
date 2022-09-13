package ProblemSolving7;

import java.util.HashSet;
import java.util.Scanner;

public class NastyaandanArray {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = 0;
        HashSet<Integer> a = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            a.add(in);
            if(in==0){
                ++c;
            }
        }
        int res = a.size();
        if(c!=0){
           --res;
        }
        System.out.println(res);
    }

}
