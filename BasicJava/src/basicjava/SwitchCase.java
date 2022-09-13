package basicjava;
import java.util.Scanner;
public class SwitchCase{
    public static void main(String[] args){
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Intezer :");
        x = input.nextInt();
        switch(x){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println(" Seveen");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                    System.out.println("Not a Int");
                
                
                
                
                
                
        }
    
}
}