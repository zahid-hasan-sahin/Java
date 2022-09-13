package JavaSwing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JPanelDemo extends JFrame {
    
    private Container con;
    private JPanel panel1, panel2;
    private JButton btn1, btn2;
    private JTextArea area;
    
    JPanelDemo() {
        init();
    }
    
    void init() {
        con = this.getContentPane();
        con.setLayout(null);
        panel1 = new JPanel();
        panel2 = new JPanel();
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        
        panel1.setBounds(20, 80, 250, 300);
        panel1.setBackground(Color.red);
        con.add(panel1);
        
        panel2.setBounds(300, 80, 250, 300);
        panel2.setBackground(Color.GREEN);
        con.add(panel2);
        
        panel1.add(btn1);
        panel1.add(btn2);
        
        area = new JTextArea();
        area.setBounds(100,100,100,100);
        panel1.add(area);

    }
    
    public static void main(String[] args) {
        JPanelDemo ob = new JPanelDemo();
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setBounds(100, 50, 600, 500);
    }
    
}
