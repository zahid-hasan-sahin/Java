
package problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arrays {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int na = scan.nextInt();
        int nb = scan.nextInt();
         int n  = scan.nextInt();
        int m = scan.nextInt();
        ArrayList<Integer> valueOfA = new ArrayList<Integer>();
        ArrayList<Integer> valueOfB = new ArrayList<Integer>();
        for (int i = 0; i < na; i++) {
            valueOfA.add(scan.nextInt());
        }
        for (int i = 0; i < nb; i++) {
            valueOfB.add(scan.nextInt());           
        }
       
        Collections.sort(valueOfA);
        Collections.sort(valueOfB);
        if(valueOfA.get(n-1)<valueOfB.get(0)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
    }
    
}
