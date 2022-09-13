package JavaSwing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ButtonDemo extends JFrame {

    private Container con;
    private JTextField ps;
    private Font f;
    private JButton btn1;
    private Cursor cur;
    private ImageIcon icon;

    ButtonDemo() {
        init();
    }

    void init() {
        icon = new ImageIcon("C:\\Users\\zahid\\Desktop\\home-page.png");
        con = this.getContentPane();
        con.setLayout(null);
        f = new Font("Arial", Font.BOLD, 24);

        ps = new JTextField();
        ps.setBounds(30, 30, 100, 50);
        cur = new Cursor(Cursor.HAND_CURSOR);

        ps.setFont(f);
        con.add(ps);
        btn1 = new JButton();
        btn1.setText("Clear");
        btn1.setBounds(30, 100, 100, 30);
        btn1.setFont(f);
        btn1.setCursor(cur);
        con.add(btn1);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ps.setText("");
            }
        });
    }

    public static void main(String args[]) {
        ButtonDemo ob = new ButtonDemo();
        ob.setVisible(true);
        ob.setBounds(50, 50, 500, 400);
        ImageIcon icon = new ImageIcon("C:\\Users\\zahid\\Desktop\\home-page.png");
        ob.setIconImage(icon.getImage());
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
