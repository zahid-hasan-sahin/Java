
package problemSolving2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AnuHasaFunction {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<String> p = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            p.add(Integer.toBinaryString(scan.nextInt()));
        }
        Collections.sort(p,Collections.reverseOrder());
        System.out.println(p);       
    }
    
}
