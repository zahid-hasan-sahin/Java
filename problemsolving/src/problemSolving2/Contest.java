
package problemSolving2;

import java.util.Scanner;

public class Contest {
    public static void main(String args[]){
        Scanner scan = new Scanner (System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        double misha = Math.max((3*a)/10, a-(a/250)*c);
        double vasya = Math.max((3*b)/10, b-(b/250)*d);
        if(misha>vasya){
            System.out.println("Misha");
        }else if(vasya>misha){
            System.out.println("Vasya");
        }else{
            System.out.println("Tie");
        }
        
        
    }
    
}
