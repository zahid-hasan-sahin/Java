

import java.util.Scanner;

public class DiceRolling {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            System.out.println((int)Math.ceil(n/7.0));
        }
        
    }
    
}
