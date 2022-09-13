package JavaSwing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionListenerDemo extends JFrame implements ActionListener {
    
    private Container con;
    private JButton red, green, blue;
    
    ActionListenerDemo() {
        init();
    }
    
    void init() {
        con = this.getContentPane();
        con.setLayout(null);
        
        red = new JButton("RED");
        green = new JButton("GREEN");
        blue = new JButton("BLUE");
        
        red.setBounds(50, 50, 100, 50);
        con.add(red);
        
        green.setBounds(50, 150, 100, 50);
        con.add(green);
        
        blue.setBounds(50, 250, 100, 50);
        con.add(blue);
        
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == red) {
            con.setBackground(Color.RED);
        }
        if (e.getSource() == green) {
            con.setBackground(Color.GREEN);
        }
        if (e.getSource() == blue) {
            con.setBackground(Color.blue);
        }
    }
    
    public static void main(String args[]) {
        ActionListenerDemo ob = new ActionListenerDemo();
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setBounds(50, 50, 500, 500);
        
    }
}
