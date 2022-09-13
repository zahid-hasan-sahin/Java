
package basicjava;
import java.util.Scanner;
public class PrimeDemo {
    public static void main(String[] args){
        int u,count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number  : ");
        u = input.nextInt();
        for(int i=2;i<u;i++){
           
            if(u%i==0){
                count++;
                break;
            }    
}
        if(count>=1){
            System.out.println(u+" is Not A Prime Number");
        }else{
            System.out.println(u+" is A Prime Number");
        }
}
}
