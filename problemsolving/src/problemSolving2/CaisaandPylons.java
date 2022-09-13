package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class CaisaandPylons {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> h = new ArrayList<Integer>();
        ArrayList<Integer> def = new ArrayList<Integer>();

        h.add(0);
        for (int i = 1; i <=n; i++) {
            h.add(scan.nextInt());
            def.add(h.get(i - 1) - h.get(i));
        }
        int temp = 0;
        int res = 0;
        System.out.println(def);
        int i = 0;
        while(def.get(i)<0 && def.size()>i){
            res += -def.get(i);
            ++i;
        }
        int b = res;
        for ( i = i; i < def.size(); i++) {
            if(def.get(i)<0){
                res -=def.get(i);
            }else{
                res +=def.get(i);
                
            }
            if(res<0){
                b +=(0-res);
            }           
            
        }
        System.out.println(b);

    }

}
