package JavaSwing;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MouseListenerDemo extends JFrame {
    
    private Container con;
    private JTextArea txt;
    private JTextField fld;
    
    MouseListenerDemo() {
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
        
        fld.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txt.append("Mouse clicked\n");
            }
            
            @Override
            public void mouseReleased(MouseEvent e) {
                txt.append("Mouse Released\n");
            }
            
            @Override
            public void mousePressed(MouseEvent e) {
                txt.append("Mouse Pressed\n");
                
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                txt.append("Mouse Entered\n");
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                txt.append("Mouse Exit\n");
            }
        });
        
    }
    
    public static void main(String args[]) {
        MouseListenerDemo ob = new MouseListenerDemo();
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setBounds(50, 50, 500, 500);
        
    }
    
}
