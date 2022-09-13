
package basicjava;

import java.util.Scanner;

public class Patterrn3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int u = input.nextInt();
        for (int row = 1; row <= u; row++) {
            for (int i = 1; i <=u; i++) {
                System.out.print(i);
                
            }
            System.out.println();
            
        }
        
}
}