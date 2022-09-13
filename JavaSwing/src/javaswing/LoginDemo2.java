
package javaswing;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class LoginDemo2 extends JFrame{
    private Container body;
private JLabel label2;
      LoginDemo2(){
          
            call();
}
    public void call(){
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,300,400,200);
        this.setVisible(true);
        
        body = this.getContentPane();
        body.setLayout(null);
        body.setBackground(Color.green);
        
         label2 = new JLabel("password :");
        label2.setBounds(30,80,110,50);
       
        body.add(label2);
    }
    public static void main(String[] args){
        
        LoginDemo2 frame= new LoginDemo2();
        
       
    }
    
}
