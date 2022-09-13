package problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class SecondOrderStatistics {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashSet<Integer> num = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            num.add(scan.nextInt());
        }
        ArrayList<Integer> tn = new ArrayList<Integer>(num);
        Collections.sort(tn);
        if(tn.size()!=1){
            System.out.println(tn.get(1));
        }else{
            System.out.println("NO");
        }     
    } 
}
