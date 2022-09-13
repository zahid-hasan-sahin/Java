
package javaswing;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class TextFieldDemo extends JFrame{
    private ImageIcon icon;
    private Container body;
    private JLabel label;
    private Font font;
    private JTextField field1;
    private JTextField field2;
    
    TextFieldDemo(){
        call();
    }
    public void call(){
        icon = new ImageIcon(getClass().getResource("Image.jpg"));
        this.setIconImage(icon.getImage());
        
        
        
        body = this.getContentPane();
        body.setLayout(null);
        body.setBackground(Color.green);
        
        
        font = new Font("Algerian",Font.BOLD+Font.ITALIC,15); 
        label = new JLabel("Email");
        label.setBounds(10,20,100,30);
        label.setFont(font);
        body.add(label);
        
        font = new Font("arial",Font.BOLD+Font.ITALIC,15);
        field1 = new JTextField("Email");
        field1.setBounds(15,55,100,25);
        field1.setFont(font);
        body.add(field1);
        
        
        font = new Font("Algerian",Font.BOLD+Font.ITALIC,15); 
        label = new JLabel("Password");
        label.setBounds(10,80,100,30);
        label.setFont(font);
        field1.setForeground(Color.white);
        field1.setBackground(Color.blue);
        body.add(label);
        
        
        font = new Font("arial",Font.BOLD+Font.ITALIC,15);
        field2 = new JTextField("Password");
        field2.setBounds(15,125,100,25);
        field2.setFont(font);
        field2.setForeground(Color.white);
        field2.setBackground(Color.blue);
        body.add(field2);
        
        
       /* 
        
        
        field1.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
               String t = field1.getText();
               
               JOptionPane.showMessageDialog(null,t);
      
            }
       
        });
        
        
        field2.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
               String t = field2.getText();
               
               JOptionPane.showMessageDialog(null,t);
      
            }
       
        });
        
        */
        
        Click f = new Click();
        field1.addActionListener(f);
        field2.addActionListener(f);
        
    }
        
        
        class Click implements ActionListener{
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                if(e.getSource()==field1){
                JOptionPane.showMessageDialog(null,field1.getText());
            }else if((field1.getText()).isEmpty()){
                
                JOptionPane.showMessageDialog(null,"Field Is Empety");
                
            }else if((field2.getText().isEmpty())){
                JOptionPane.showMessageDialog(null,"Field Is Empety");
            }else{
                JOptionPane.showMessageDialog(null,field2.getText());
                }
                
            }
            
            
        }
        
        
        
        
    
    
    
    public static void main(String[] args){
        TextFieldDemo frame = new TextFieldDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        frame.setBounds(300,200,300,250);
        
       
        
        
        
    }
    
}
