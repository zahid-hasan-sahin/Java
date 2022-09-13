
package basicjava;
import java.util.Scanner;
public class ArmStrongFull {
    public static void main(String [] args){
        int u,temp,sum=0;
        Scanner input = new Scanner(System.in);
        //System.out.print("Eneter Where From : ");
        //u = input.nextInt();
        //for(u=10;u<=20;u++){
            //System.out.println(u);
       // temp = u;
        for (u=1;u<=10;u++){
            int r =  u%10;
             sum = sum +r;
             u = u/10;
           System.out.println(sum); 
           if(u==0){
               break;
           }
        }
       
        
        }
    }
    

