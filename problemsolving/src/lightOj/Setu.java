package lightOj;

import java.util.Scanner;

public class Setu {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int t = 1;
        while (q-- > 0) {
            int n = scan.nextInt();
            long p =0;
            System.out.println("Case "+t+++":");
            while (n-- > 0) {
                String s = scan.next();
                if(s.equals("donate")){
                    p+= scan.nextInt();
                }else{
                    System.out.println(p);
                }
                
                
            }
            
        }
    }
}
