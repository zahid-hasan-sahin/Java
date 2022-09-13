package JavaSwing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ActionLinetenerDemo extends JFrame {

    ActionLinetenerDemo() {
        initCompo();
    }
    JTextField txt;
    JTextField txt2;

    void initCompo() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 700, 500);
        ImageIcon ob = new ImageIcon("C:\\Users\\zahid\\Desktop\\home-page.png");

        setIconImage(ob.getImage());
        Container con = getContentPane();
        con.setBackground(Color.PINK);
        con.setLayout(null);
        txt = new JTextField("zahid");
        con.add(txt);
        txt.setBounds(50, 50, 100, 50);

        txt2 = new JTextField("zahid");
        con.add(txt2);
        txt2.setBounds(50, 100, 100, 50);
        txt.addActionListener(new Handle());
        txt2.addActionListener(new Handle());
    }

    class Handle implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == txt) {
                JOptionPane.showMessageDialog(null, "hehe");
            } else {
                JOptionPane.showMessageDialog(null, "dfs");
            }
        }

    }

    public static void main(String args[]) {
        ActionLinetenerDemo ob = new ActionLinetenerDemo();

    }

}
