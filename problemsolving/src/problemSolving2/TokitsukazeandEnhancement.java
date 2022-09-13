
package problemSolving2;

import java.util.Scanner;

public class TokitsukazeandEnhancement {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n%4==1){
            System.out.println(0+" A");
        }else if(n%4==2){
            System.out.println(1+" B");
        }else if(n%4==3){
            System.out.println(2+" A");
        }else{
            System.out.println(1+" A");
        }
        
        
    }
    
}
