package JavaSwing;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class RadioButtonDemo extends JFrame {

    private Container con;
    private JRadioButton male, female;
    private Font f;
    private ButtonGroup btn;
    private JTextArea txt;

    RadioButtonDemo() {
        init();
    }

    void init() {
        con = getContentPane();
        con.setLayout(null);
        f = new Font("Arial", Font.BOLD, 18);
        btn = new ButtonGroup();
        txt = new JTextArea();

        male = new JRadioButton("Male", true);
        male.setBounds(10, 10, 100, 50);
        male.setFont(f);
        con.add(male);

        female = new JRadioButton();
        female.setText("Female");
        female.setBounds(150, 10, 100, 50);
        female.setFont(f);
        con.add(female);

        btn.add(male);
        btn.add(female);

        txt.setBounds(100, 100, 200, 300);
        txt.setFont(f);
        con.add(txt);

        Handle ob = new Handle();
        male.addActionListener(ob);
        female.addActionListener(ob);

    }

    class Handle implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (male.isSelected()) {
                txt.append("Male\n");
            } else {
                txt.append("Female\n");
            }
        }
    }

    public static void main(String args[]) {
        RadioButtonDemo ob = new RadioButtonDemo();
        ob.setVisible(true);
        ob.setBounds(100, 50, 600, 500);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
