package basicjava;
import java.util.Scanner;
public class PrimeAll {
    public static void main(String[] args){
         int f,t,count =0,total = 0;
    Scanner input = new  Scanner(System.in);
    System.out.print("Enter Where From: ");
    f = input.nextInt();
    System.out.print("Enter Where To: ");
    t = input.nextInt();
   
        for (int i = f; i <= t; i++) {
            for (int j = 2; j <i; j++) {
                if(i%j==0){
                    count++;                 
                    break;
                }
           }
            if(count==0){
                System.out.println(i);
                total++;
               
            }
             count=0;
           
        }
        System.out.println("Total= "+total);
    }
    
}
