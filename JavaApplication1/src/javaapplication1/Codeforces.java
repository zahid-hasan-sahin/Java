package javaapplication1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Codeforces {

    public static void main(String args[]) {
        ArrayList<Integer> k = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Value: ");
        for (int i = 0; i <= 3; i++) {
            k.add(i,scan.nextInt());
           
        }
        Collections.sort(k);
        if(k.get(0)+k.get(2)==k.get(1)+k.get(3) || k.get(1)+k.get(2)==k.get(0)+k.get(3) || k.get(0)+k.get(1)+k.get(2)==k.get(3)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        

    }

}
