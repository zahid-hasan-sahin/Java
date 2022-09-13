
package javaswing;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JButtonDemo extends JFrame{
    private ImageIcon icon;
    private Container body;
    private JButton button1,button2;
    private Cursor c;
    private Font font;
    private JTextField text;
    JButtonDemo(){
        call();
    }
    public void call(){
        icon = new ImageIcon(getClass().getResource("image.jpg"));
        this.setIconImage(icon.getImage());
         icon = new ImageIcon(getClass().getResource("image.jpg"));
        
         
         body = this.getContentPane();
         body.setLayout(null);
         body.setBackground(Color.green);
         c = new Cursor(Cursor.HAND_CURSOR);
         
       /*  button1 = new JButton("Submmit");
         button1.setBounds(50,50,100,50);
         button1.setCursor(c);
         body.add(button1);
         
               */
         text = new JTextField();
         text.setBounds(50,50,160,40);
         body.add(text);
         
         font = new Font("Arial",Font.BOLD,20);
         
         button2 = new JButton("Click");
         button2.setFont(font);
         button2.setBounds(50,100,100,50);
         button2.setBackground(Color.blue);
         button2.setForeground(Color.WHITE);
         body.add(button2);
         
         button2.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e){
                 text.setText("");
                 
             }
             
             
             
         });
         
         
         
         
    }
    
    public static void main(String[] args){
        
        JButtonDemo frame = new JButtonDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,250,400,300);
        frame.setTitle("JButton");
       
        
    }
    
}
