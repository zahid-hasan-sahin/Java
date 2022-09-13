package JavaSwing;

import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class TabbedPaneDemo extends JFrame {

    private Container con;
    private JTabbedPane pane;
    private JPanel home, about, logout;
    private ImageIcon img1;

    TabbedPaneDemo() {
        init();
    }

    void init() {
        con = getContentPane();
        con.setLayout(null);
        home = new JPanel();

        about = new JPanel();
        logout = new JPanel();

        pane = new JTabbedPane();
        pane.setBounds(50, 50, 300, 300);
        con.add(pane);
        pane.addTab("Home", home);
        pane.addTab("About", about);
        pane.addTab("Logout", logout);

    }

    public static void main(String args[]) {
        TabbedPaneDemo ob = new TabbedPaneDemo();
        ob.setVisible(true);
        ob.setBounds(50, 80, 500, 600);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
