
package javaswing;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class LoginFrameDemo extends JFrame {
    
    private Container body;
    private JLabel label1,label2;
    private JPasswordField pass;
    private JTextField email;
    private JButton button1,button2;
    private Font font;
    
    LoginFrameDemo(){
            call();
}
    public void call(){
        body = this.getContentPane();
        body.setLayout(null);
        body.setBackground(Color.green);
        
        
        font = new Font("arial",Font.BOLD,20);
        
        label1 = new JLabel("Email :");
        label1.setFont(font);
        label1.setBounds(30,20,100,50);
        body.add(label1);
        
        email = new JTextField();
        email.setBounds(160,20,220,50);
        email.setFont(font);
        body.add(email);
        
        label2 = new JLabel("password :");
        label2.setBounds(30,80,110,50);
        label2.setFont(font);
        body.add(label2);
        
        
        pass = new JPasswordField();
        pass.setEchoChar('*');
        pass.setFont(font);
        pass.setBounds(160,80,220,50);
        body.add(pass);
        
        button1= new JButton("Login");
        button1.setFont(font);
        button1.setBounds(160,140,100,50);
        body.add(button1);
        
        
        button2= new JButton("Clear");
        button2.setFont(font);
        button2.setBounds(280,140,100,50);
        body.add(button2);
        
        
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ev){
                    email.setText("");
                    pass.setText("");
             
            }});
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                
                String e= email.getText();
                String p = pass.getText();
                
                if(e.equalsIgnoreCase("zahid") && p.equals("1234")){
                    LoginDemo2 o = new LoginDemo2();
                    o.setVisible(true);
                    
                }else{
                    JOptionPane.showMessageDialog(null,"Email Or Password Incorrect");
                }
                
                
                
                
            }});
 
        
        
        
    }
    
    public static void main(String[] args){
        LoginFrameDemo frame = new LoginFrameDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,200,500,400);
        frame.setTitle("Login Frame");
        
        
        
        
        
    } 
    
}
