
package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class CurrencySysteminGeraldion {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> val = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            val.add(scan.nextInt());
        }
        if(val.contains(1)){
            System.out.println("-1");
        }else{
            System.out.println(1);
        }
    }
    
}
