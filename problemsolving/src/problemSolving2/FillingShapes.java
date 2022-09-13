
package problemSolving2;

import java.util.Scanner;

public class FillingShapes {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n%2==1){
            System.out.println("-1");
        }else{
            System.out.println((n/2)*2);
        }
        
        
    }
    
}
