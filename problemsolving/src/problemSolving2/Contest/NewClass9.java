package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class NewClass9 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        while (t-- > 0) {
            String a = scan.next();
            String b = scan.next();
            String c = scan.next();
            boolean ch = false;
            for (int i = 0; i < a.length(); i++) {
                if(a.charAt(i)==c.charAt(i) || c.charAt(i)==b.charAt(i)){
                    
                }else{
                    ch = true;
                }

            }
            System.out.println(ch?"NO":"YES");
        }

    }

}
