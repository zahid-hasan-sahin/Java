
package javaswing;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class ChangeIcon extends JFrame {
    private ImageIcon i;
    ChangeIcon(){
        Method();
    }
    public void Method(){
         i = new ImageIcon(getClass().getResource("image.jpg"));
            this.setIconImage(i.getImage());
        
        
    }
    public static void main(String[] args){
        ChangeIcon frame = new ChangeIcon();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setBounds(200,200,300,400);
        frame.setTitle("Game");
        
        
        
        
        
        
        
    }
    
}
