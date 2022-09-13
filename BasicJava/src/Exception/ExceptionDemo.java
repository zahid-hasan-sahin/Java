
package Exception;
import javax.swing.JOptionPane;
public class ExceptionDemo {
    public static void main(String[] args){
        try{
            System.out.println();
        }
        catch(ArithmeticException f){
            System.out.println("Its Ok");
        }
        catch(Exception r){
           JOptionPane.showMessageDialog(null,"Password Is Not correct","no",3);
        }
        
        System.out.println("Last Lien");
        
    }
    
}
