
package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class ValeraandAntiqueItems {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int v = scan.nextInt();
        ArrayList<Integer> dn = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            boolean ch = false;
            int item = scan.nextInt();
            for (int j = 0; j < item; j++) {
                if(scan.nextInt()<v){
                    ch = true;
                }
            }
            if(ch){
                dn.add(i+1);
            }
        }
        System.out.println(dn.size());
        for (int i = 0; i < dn.size(); i++) {
            System.out.print(dn.get(i)+" ");
        }
        System.out.println();
        
        
    }
    
}
