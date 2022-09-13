package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class NewClass2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        int r = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='R'){
                ++r;
            }else{
                ++l;
            }
        }
        
        System.out.println((Math.abs(0-r)+Math.abs(0-l))+1);      
    }
}
