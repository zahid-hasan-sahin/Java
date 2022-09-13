package JavaSwing;

import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FocusListenerDemo extends JFrame {
    
    private Container con;
    private JTextArea txt;
    private JTextField fld;
    
    FocusListenerDemo() {
        init();
    }
    
    void init() {
        con = this.getContentPane();
        con.setLayout(null);
        
        fld = new JTextField();
        fld.setBounds(50, 50, 200, 50);
        con.add(fld);
        
        txt = new JTextArea();
        txt.setBounds(50, 150, 200, 300);
        con.add(txt);
        
        fld.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                txt.append("Focused Gaind\n");
            }
            
            public void focusLost(FocusEvent e) {
                txt.append("Focused Lost\n");
            }
        });
        
    }
    
    public static void main(String args[]) {
        FocusListenerDemo ob = new FocusListenerDemo();
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setBounds(50, 50, 500, 500);
        
    }
    
}
