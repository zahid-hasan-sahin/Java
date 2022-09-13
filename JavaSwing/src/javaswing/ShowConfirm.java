
package javaswing;

import javax.swing.JOptionPane;

public class ShowConfirm {
    public static void main(String [] args){
        
      int c =  JOptionPane.showConfirmDialog(null, "Do You want to Really Exist", "Exist",JOptionPane.YES_NO_CANCEL_OPTION, 2);
        
        if(c==JOptionPane.YES_OPTION){
            System.exit(0);
            
        }
        if(c==JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null,"YOu Have clicked NO");
        }
        else{
            JOptionPane.showMessageDialog(null,"You Have Cliked Cancel");
        }
      
      
    }
    
}
