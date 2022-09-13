
package problemSolving2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MahmoudandaTriangle {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> pos = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            pos.add(scan.nextInt());
        }
        
        Collections.sort(pos);
        boolean res = false;
        for (int i = 1; i < n-1;i++) {         
            if(pos.get(i-1)+pos.get(i)>pos.get(i+1)){
                res = true;
                break;
            }
        }
        System.out.println(res?"YES":"NO");             
    }
    
}
