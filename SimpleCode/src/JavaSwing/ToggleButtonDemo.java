package JavaSwing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class ToggleButtonDemo extends JFrame {

    private Container con;
    private JToggleButton btn;
    private ImageIcon img1, img2;

    ToggleButtonDemo() {
        init();
    }

    void init() {
        con = getContentPane();
        con.setLayout(null);
        btn = new JToggleButton("Button");
        btn.setBounds(100, 100, 100, 100);
        con.add(btn);
        img1 = new ImageIcon("C:\\Users\\zahid\\Desktop\\home.png");
        Image ob = img1.getImage().getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_SMOOTH);
        img1 = new ImageIcon(ob);
        btn.setIcon(img1);

        img2 = new ImageIcon("C:\\Users\\zahid\\Desktop\\1.jpg");
        ob = img2.getImage().getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_SMOOTH);
        img2 = new ImageIcon(ob);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (btn.isSelected()) {
                    btn.setIcon(img2);
                } else {
                    btn.setIcon(img1);
                }
            }
        });
    }

    public static void main(String args[]) {

        ToggleButtonDemo ob = new ToggleButtonDemo();
        ob.setVisible(true);
        ob.setBounds(50, 80, 500, 600);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
