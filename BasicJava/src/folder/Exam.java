
package folder;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exam {
    public static void main(String[] args){
        
        try{ 
            Scanner input = new Scanner (System.in);  
         System.out.print("Enter The Number : ");
          int i = input.nextInt();
            System.out.println("Welcome "+i);
            
        } 
        catch(Exception r){
           JOptionPane.showMessageDialog(null,"Password Is Not correct","no",3);
        }
        
        
        
        
        
        
        
        
    }
    
}
