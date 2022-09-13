package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class InterestingSubarray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            ArrayList<Integer> val = new ArrayList<Integer>();
            int min = 1000000000;
            for (int i = 0; i < n; i++) {
                val.add(scan.nextInt());
                if(val.get(i)<min){
                    min = i;
                }
            }
            System.out.println(min);
            
            
        }

    }
} 

