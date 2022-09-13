
package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> entry = new ArrayList<Integer>();
        int n =scan.nextInt();
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            if(entry.contains(in)){
                entry.remove(Integer.valueOf(in));
                entry.add(in);
            }else{
                entry.add(in);
            }
        }
        System.out.println(entry.size());
        for (int i = 0; i < entry.size(); i++) {
            System.out.print(entry.get(i)+" ");
        }
        System.out.println();
        
        
    }
    
}
