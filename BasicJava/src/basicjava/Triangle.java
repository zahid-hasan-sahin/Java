
package basicjava;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args){
        double base,height,area;
        Scanner input = new Scanner(System.in);
        System.out.print("Ente the base : ");
        base = input.nextDouble();
        System.out.print("Enter the height : ");
        height = input.nextDouble();
        area = 0.5 * base * height;
        System.out.println("The area is :"+area);
        
    }
    
}
