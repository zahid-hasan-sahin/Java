package Assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice_12_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<Integer>();
        while(true){
            int in = scan.nextInt();
            if(in==-1){
                break;
            }
            ar.add(in);
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < ar.size(); i++) {
            min = Math.min(min, ar.get(i));
            max= Math.max(max, ar.get(i));
            sum += ar.get(i);
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        System.out.println("Avg: "+(sum/(double)ar.size()));
    }
}
