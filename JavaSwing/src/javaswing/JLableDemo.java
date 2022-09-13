
package javaswing;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JLabel;
import java.awt.Font;
public class JLableDemo extends JFrame {
    private ImageIcon icon ,i;
    private Container body;
    private JLabel label,label1 ;
    private Font font;
    JLableDemo(){
        Call();
    }
    public void Call(){
        icon = new ImageIcon(getClass().getResource("image.jpg"));
        this.setIconImage(icon.getImage());
        
        
        body = this.getContentPane();
        body.setLayout(null);
        body.setBackground(Color.yellow);
        
        
        
        
        font = new Font("Arial",Font.BOLD,10);
        label = new JLabel();
        label.setText("Enter The Name :");
        label.setBounds(50,20, 100, 50);
        label.setOpaque(true);
        label.setBackground(Color.green);       
        label.setFont(font);
        label.setToolTipText("Enter Your Name Here ");
        body.add(label);
        
        System.out.println(label.getText());
        System.out.println(label.getToolTipText());
        
        
        label1 = new JLabel("Enter Your Password: ");
        label1.setBounds(50,100, 150, 50);
        label1.setForeground(Color.red);
        body.add(label1);
        
        
        
        
       
    }
    
    
    public static void main(String[] args){
        JLableDemo frame = new JLableDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,200,300,200);
        
        
        
        
        
    }
    
}
