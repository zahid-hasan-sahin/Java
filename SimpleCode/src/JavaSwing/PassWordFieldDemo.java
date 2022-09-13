package JavaSwing;

import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class PassWordFieldDemo extends JFrame {

    private Container con;
    private JPasswordField ps;
    private Font f;

    PassWordFieldDemo() {
        init();
    }

    void init() {
        con = this.getContentPane();
        con.setLayout(null);
        f = new Font("Arial", Font.BOLD, 24);
        
        
        ps = new JPasswordField();
        ps.setBounds(30, 30, 100, 30);
        ps.setEchoChar('*');
       
        ps.setFont(f);
        con.add(ps);

    }

    public static void main(String args[]) {
        PassWordFieldDemo ob = new PassWordFieldDemo();
        ob.setVisible(true);
        ob.setBounds(50, 50, 500, 400);
        ImageIcon icon = new ImageIcon("C:\\Users\\zahid\\Desktop\\home-page.png");
        ob.setIconImage(icon.getImage());
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
