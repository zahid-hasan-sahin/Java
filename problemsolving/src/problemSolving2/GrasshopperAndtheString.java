package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class GrasshopperAndtheString {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int minAb = 0;
        ArrayList<Integer> vawPos = new ArrayList<Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'Y') {
                vawPos.add(i+1);
            }
        }vawPos.add(s.length()+1);
        
        vawPos.add(0,0);
        int minab = 1;
        for (int i = 0; i < vawPos.size()-1; i++) {
            if(vawPos.get(i+1)-vawPos.get(i)>minab){
                minab = vawPos.get(i+1)-vawPos.get(i);
            }
        }
        System.out.println(minab);
    }

}
