package JavaSwing;

import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class multiplicationTable extends JFrame {

    private Container con;
    private JLabel label;
    private JButton submit, clear;
    private Font f, f2;
    private JTextField txt;
    private Cursor cur;

    private JTextArea mul;

    multiplicationTable() {
        init();
    }

    void init() {
        con = getContentPane();
        con.setLayout(null);
        f = new Font("Arial", Font.BOLD, 13);
        f2 = new Font("Arial", Font.BOLD, 18);
        cur = new Cursor(Cursor.HAND_CURSOR);

        label = new JLabel();
        label.setBounds(10, 10, 365, 150);
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("C:\\Users\\zahid\\Desktop\\a.jpg").getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(imageIcon);
        con.add(label);

        txt = new JTextField();
        txt.setBounds(10, 170, 150, 60);
        txt.setFont(f2);
        con.add(txt);

        submit = new JButton("Submit");
        submit.setBounds(170, 180, 80, 40);
        submit.setFont(f);
        submit.setCursor(cur);
        con.add(submit);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String in = txt.getText();
                if (in.isEmpty() || !isNum(in)) {
                    JOptionPane.showMessageDialog(null, "Enter a Valid Number");

                } else {
                    mul.setText("");
                    int num = Integer.valueOf(in);
                    String res = "";
                    for (int i = 1; i <= 10; i++) {
                        res += (i + " * " + num + " = " + (num * i) + "\n");
                    }
                    System.out.println(res);
                    mul.setText(res);
                }
            }
        });

        clear = new JButton("Clear");
        clear.setBounds(260, 180, 80, 40);
        clear.setFont(f);
        clear.setCursor(cur);
        con.add(clear);
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mul.setText("");
                txt.setText("");
            }
        });

        mul = new JTextArea();
        mul.setOpaque(true);
        mul.setBounds(50, 240, 270, 310);
        mul.setMargin(new Insets(10, 50, 10, 10));
        mul.setFont(f2);
        mul.setBackground(null);
        con.add(mul);

    }

    boolean isNum(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        multiplicationTable ob = new multiplicationTable();
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setBounds(50, 50, 400, 600);
    }

}
