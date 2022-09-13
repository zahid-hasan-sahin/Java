package JavaSwing;

import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SpinerDemo extends JFrame {
    
    private Container con;
    private JLabel label;
    private JSpinner sp;
    
    SpinerDemo() {
        init();
    }
    
    void init() {
        con = getContentPane();
        
        con.setLayout(null);
        SpinnerNumberModel ob = new SpinnerNumberModel(0, 0, 30, 1);
        label = new JLabel();
        sp = new JSpinner(ob);
        
        sp.setBounds(100, 100, 70, 70);
        con.add(sp);
        
        label.setBounds(100, 200, 70, 70);
        con.add(label);
        sp.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                String in = sp.getValue().toString();
                label.setText(in);
                
            }
        });
        
    }
    
    public static void main(String args[]) {
        SpinerDemo ob = new SpinerDemo();
        ob.setVisible(true);
        ob.setBounds(50, 80, 500, 600);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
