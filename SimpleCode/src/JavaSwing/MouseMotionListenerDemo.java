package JavaSwing;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MouseMotionListenerDemo extends JFrame {

    private Container con;
    private JTextArea txt;
    private JTextField fld;

    MouseMotionListenerDemo() {
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

        txt.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                fld.setText(e.getX() + " " + e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                fld.setText(e.getX() + " " + e.getY());
            }
        });
    }

    public static void main(String args[]) {
        MouseMotionListenerDemo ob = new MouseMotionListenerDemo();
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setBounds(50, 50, 500, 500);

    }

}
