
package basicjava;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args){
        double radius,area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius : ");
        radius = input.nextDouble();
        area = 3.1416 * radius * radius;
        System.out.println("The area of Cercle: "+area);
        
    }
    
}
