package JavaSwing;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlideShow extends JFrame {

    private JLabel label;
    private JButton pre, next;
    private Container con;
    private ImageIcon icon;
    private JPanel panel;
    private CardLayout card;

    SlideShow() {
        init();
        showImage();
    }

    void showImage() {
        String[] s = {"1.jpg", "2.jpg", "3.jpg"};

        for (String in : s) {
            label = new JLabel();
            icon = new ImageIcon("C:\\Users\\zahid\\Desktop\\" + in);
            Image img = icon.getImage().getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(img);

            label.setIcon(icon);
            panel.add(label);
        }

    }

    void init() {
        con = getContentPane();
        con.setLayout(null);
        card = new CardLayout();

        panel = new JPanel(card);
        panel.setBounds(50, 20, 400, 400);
        //   panel.setLayout(card);
        con.add(panel);

        pre = new JButton("Previus");
        pre.setBounds(50, 430, 80, 30);
        con.add(pre);

        next = new JButton("Next");
        next.setBounds(370, 430, 80, 30);
        con.add(next);

        Helper ob = new Helper();
        next.addActionListener(ob);
        pre.addActionListener(ob);

    }

    class Helper implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == pre) {
                card.previous(panel);
            } else {
                card.next(panel);
            }
        }

    }

    public static void main(String args[]) {
        SlideShow ob = new SlideShow();
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setBounds(100, 50, 500, 550);
        ob.setTitle("Slide Show");

    }
}
