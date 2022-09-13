
package ProblemSolving;
import java.util.Scanner;
public class ExceptionHadling {
    public static void main(String[] args){
        int num1,num2,count = 1;
       
        do{
        try{
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter A Number : ");
        num1 = input.nextInt();
        System.out.print("Please Enter Another Number : ");
        num2 = input.nextInt();     
        System.out.printf("Result : %d / %d = %d \n",num1,num2,num1/num2);
        count = 2 ;
        }catch(Exception e){
            System.out.println(e+"\nPlese Enter A Enteger Number ");
           
        }
        }while(count==1);//SomeThing Wrong
        
        
        
        
        
    }
    
}
