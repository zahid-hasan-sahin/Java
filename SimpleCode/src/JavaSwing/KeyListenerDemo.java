package JavaSwing;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyListenerDemo extends JFrame {

    private Container con;
    private JTextArea txt;
    private JTextField fld;

    KeyListenerDemo() {
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

        fld.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                txt.append("presed  " + e.getKeyChar() + "\n");
            }

            @Override
            public void keyTyped(KeyEvent e) {
                txt.append("keyTyped  " + e.getKeyChar() + "\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                txt.append("keyReleased  " + e.getKeyChar() + "\n");

            }
        });

    }

    public static void main(String args[]) {
        KeyListenerDemo ob = new KeyListenerDemo();
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setBounds(50, 50, 500, 500);

    }

}
