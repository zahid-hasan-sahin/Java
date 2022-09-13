package JavaSwing;

import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WindowActiveListenerDemo extends JFrame {

    private Container con;
    private JTextArea txt;
    private JTextField fld;

    WindowActiveListenerDemo() {
        init();
    }

    void init() {
        con = this.getContentPane();
        con.setLayout(null);

        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("windowOpened");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("windowClosed");

            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("windowActivated");

            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("windowDeactivated");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("windowIconified");

            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("windowDeiconified");

            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("windowClosing");

            }
        });

    }

    public static void main(String args[]) {
        WindowActiveListenerDemo ob = new WindowActiveListenerDemo();
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ob.setBounds(50, 50, 500, 500);

    }

}
