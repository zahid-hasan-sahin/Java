
package javaswing;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.Font;
public class JTextAreaDemo extends JFrame{
    public Container body;
    public JTextArea field ;
    private Font font ;
    JTextAreaDemo(){
        call();
    }
        public void call(){
            body= this.getContentPane();
            body.setLayout(null);
            body.setBackground(Color.green);
            
            font = new Font("Arial",Font.BOLD+Font.ITALIC,20);
            
           field = new JTextArea();
           field.setText("THis isd an ksetjlj");
            field.setBounds(20,50,300,200);
            field.setFont(font);
            field.setBackground(Color.black);
            field.setForeground(Color.white);
            field.setLineWrap(true);
            field.setWrapStyleWord(true);
            body.add(field);
            
        }
    public static void main(String[] args){
       JTextAreaDemo frame = new JTextAreaDemo();
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBounds(300,200,400,500);
       
        
        
        
    }
    
}