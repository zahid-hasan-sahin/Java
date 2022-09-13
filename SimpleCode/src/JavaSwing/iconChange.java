package JavaSwing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument.Content;

public class iconChange extends JFrame {

    private Font f;

    iconChange() {
        initCompo();
    }

    void initCompo() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 700, 500);
        ImageIcon ob = new ImageIcon("C:\\Users\\zahid\\Desktop\\home-page.png");
        setIconImage(ob.getImage());
        Container con = getContentPane();
        con.setBackground(Color.PINK);
        con.setLayout(null);
        JTextField txt = new JTextField("zahid");
        con.add(txt);
        txt.setBounds(50, 50, 100, 50);
        txt.setForeground(Color.red);
        txt.setBackground(Color.GRAY);
        txt.setHorizontalAlignment(JTextField.LEFT);

    }

    public static void main(String args[]) {
        iconChange ob = new iconChange();
    }

}
