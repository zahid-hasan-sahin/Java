
package javaswing;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ShowInput {
    public static void main(String[] args){
        ImageIcon img = new ImageIcon("NATFL010.JPG");
        
     String name =   JOptionPane.showInputDialog(null, "Entter Your Name :","Sahin");
        JOptionPane.showMessageDialog(null,name+" Welcome","Welcome",2,img);
        
        
        
    }
    
}
