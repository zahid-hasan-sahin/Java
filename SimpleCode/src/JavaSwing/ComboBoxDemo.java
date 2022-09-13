package JavaSwing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxDemo extends JFrame {

    private Container con;
    private JComboBox box;
    private String[] s = {"Java", "C++", "Php", "Python"};
    private JLabel label;

    ComboBoxDemo() {
        init();
    }

    void init() {
        con = this.getContentPane();
        con.setLayout(null);
        label = new JLabel();
        box = new JComboBox(s);

        box.setBounds(20, 20, 100, 50);
        box.setEditable(true);
        box.setSelectedItem("Java");
        con.add(box);

        label.setBounds(150, 20, 200, 50);
        con.add(label);

        box.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText(box.getSelectedItem().toString());
            }
        });
    }

    public static void main(String args[]) {
        ComboBoxDemo ob = new ComboBoxDemo();
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setBounds(50, 50, 500, 500);

    }

}
