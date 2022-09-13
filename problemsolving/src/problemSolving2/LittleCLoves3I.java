
package problemSolving2;

import java.util.Scanner;

public class LittleCLoves3I {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n%3==1 || n%3==2){
            System.out.print((n-3)+" 2"+" 1");
        }else{
            System.out.println((n-2)+" 1"+" 1");
        }
        System.out.println();
        
    }
    
}
