package problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HolidayOfEquality {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        ArrayList<Integer> val = new ArrayList<Integer>();

        for (int i = 0; i < total; i++) {
           val.add(scan.nextInt());
        }
        Collections.sort(val);
        int spend = 0;
        for (int i = 0; i < total; i++) {
            spend = spend + (val.get(val.size()-1)-val.get(i));
            
        }
        System.out.println(spend);
    }

}
