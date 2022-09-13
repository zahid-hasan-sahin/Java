
package javaswing;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;

import java.awt.Transparency;
public class PasswordFieldDemo extends JFrame{
    private ImageIcon icon;
    private JPasswordField pass;
    private Container body;
    private Font font;
    
    PasswordFieldDemo(){
        call();
    }
    public void call(){
        
       icon = new ImageIcon(getClass().getResource("image.jpg"));
        this.setIconImage(icon.getImage());
        
        
        body = this.getContentPane();
        body.setLayout(null);
        body.setBackground(Color.orange);
        
        
        
       font = new Font("arial",Font.BOLD,30);
       pass.setForeground(Color.white);
        pass = new JPasswordField();
        pass.setBackground(Color.red);
        
        pass.setFont(font);
        pass.setBounds(50,50,150,40);
        pass.setEchoChar('#');
        body.add(pass);
         
        
       
       
        
        
        
        
    }
    public static void main(String[] args){
        
        PasswordFieldDemo frame = new PasswordFieldDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,150,400,500);
        frame.setTitle("Password Field");
        
        
        
    }
    
}
