package problemsolving;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberofWays {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<String> s = new ArrayList<>();
        for (int i = 0; i < total; i++) {
            array.add(i, scan.nextInt());
        }
        int f = array.get(0);
        int m = array.get(3);
        int l = array.get(5);
        while ((f != m)) {
            int i = 0;
            if (f != m) {
                f = f + array.get(i);                
                m = m + array.get(i+2);
              
            }else{
                break;
            }
            
            i++;

        }

    }

}
