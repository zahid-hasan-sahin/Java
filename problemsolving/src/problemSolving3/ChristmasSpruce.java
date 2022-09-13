package problemSolving3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ChristmasSpruce {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
      
        int n = scan.nextInt();
        HashMap<Integer, Integer> child = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> per = new HashMap<Integer, Integer>();
        int k = 2;
        for (int i = 0; i < n - 1; i++) {
            int in = scan.nextInt();
            per.put(k++, in);
            int temp = child.get(in) == null ? 1 : child.get(in) + 1;
            child.put(in, temp);
            if (per.get(in) != null) {
                child.put(per.get(in), child.get(per.get(in)) - 1);
                per.put(in,null);
            }
        }
        ArrayList<Integer> arra = new ArrayList<Integer>(child.values());
        for (int i = 0; i < arra.size(); i++) {
            if(arra.get(i)<3){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}
