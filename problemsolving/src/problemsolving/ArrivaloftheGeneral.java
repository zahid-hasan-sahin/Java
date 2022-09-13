package problemsolving;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrivaloftheGeneral {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(scan.nextInt());
        }
        int max = 0;
        int min = 0;
        for (int i = 1; i < a.size(); i++) {
            if (a.get(max) < a.get(i)) {
                max = i;
            }
            if (a.get(min) >= a.get(i)) {
                min = i;
            }

        }
        if(max>min){
            System.out.println(((max-1)+((n-min)-1)));
        }else{
            System.out.println((max-1)+(n-min));
            
        }
    }
}
