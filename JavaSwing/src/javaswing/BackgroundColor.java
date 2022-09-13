
package javaswing;
import java.awt.Color;
import java.awt.Container;
import java.awt.Transparency;
import javax.swing.JFrame;
import javax.swing.ImageIcon ;
public class BackgroundColor extends JFrame {
    private Container c;
    private  ImageIcon i ;
    BackgroundColor(){
        Method();
        
    }
     public void Method(){
         c = this.getContentPane();
         c.setBackground(Color.black);
         
         i = new ImageIcon(getClass().getResource("image.jpg"));
            this.setIconImage(i.getImage());
        
        
    }
    public static void main(String[] args){
        
        BackgroundColor frame = new BackgroundColor();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,200,300,300);
        
        
        
        
        
    }
    
}
