
package javaswing;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;

public class JLableImg extends JFrame{
    private ImageIcon icon;
    private Container body;
    private JLabel label;
    private Font font;
    JLableImg(){
        call();
    }
    public void call(){
        icon = new ImageIcon(getClass().getResource("image.jpg"));
        this.setIconImage(icon.getImage());
        
        
        body = this.getContentPane();
        body.setLayout(null);
        body.setBackground(Color.green);
        
        font = new Font("Arial",Font.BOLD,11);
        
        
       // ImageIcon img = new ImageIcon(getClass().getResource("Image.jpg"));
        //JLabel j= new JLabel(img);
        //j.setBounds(30,130,img.getIconWidth(),img.getIconWidth());
        //body.add(j);
        
        
       label = new JLabel("Haha i have done this work");
        label.setFont(font);
        label.setOpaque(true);
        label.setBackground(Color.blue);
        label.setForeground(Color.red);
        label.setToolTipText("Haha This Is A ToolTip");
        label.setBounds(20,30,500,450);
        body.add(label);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    public static void main(String[] args){
        
        
        JLableImg frame = new JLableImg();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,200,250,300);
        
        
        
    }
    
}
