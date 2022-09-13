package problemSolving3;

import java.util.Scanner;

public class NewClass9 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            if(n%2==0){
                System.out.println(n/2-1);
            }else{
                System.out.println(n/2);
            }
        }
        
        
        
    }

}
