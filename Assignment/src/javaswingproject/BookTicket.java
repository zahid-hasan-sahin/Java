package javaswingproject;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BookTicket extends JFrame {

    BookTicket() {
        setTitle("Flight");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        setContentPane(new JLabel(new ImageIcon("C:\\Users\\Zahid\\Desktop\\bg.jpg")));

        JLabel label1 = new JLabel("Book A Ticket");
        label1.setFont(new Font("Verdana", Font.ITALIC, 20));
        label1.setBounds(350, 50, 150, 40);
        add(label1);

        JLabel label2 = new JLabel("Number of Ticket:");
        label2.setFont(new Font("Verdana", Font.PLAIN, 16));
        label2.setBounds(50, 150, 150, 40);
        add(label2);

        JTextField textfield1 = new JTextField("");
        textfield1.setFont(new Font("Verdana", Font.PLAIN, 16));
        textfield1.setBounds(220, 150, 150, 40);
        add(textfield1);

        JRadioButton r1 = new JRadioButton("One way");
        JRadioButton r2 = new JRadioButton("Round Trip");
        r1.setBounds(180, 230, 100, 30);
        r2.setBounds(300, 230, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        add(r1);
        add(r2);

        JLabel label3 = new JLabel("Class:");
        label3.setFont(new Font("Verdana", Font.PLAIN, 16));
        label3.setBounds(150, 290, 150, 40);
        add(label3);

        String[] optionsToChoose = {"Economy", "Business"};
        JComboBox<String> box = new JComboBox<>(optionsToChoose);
        box.setBounds(220, 300, 140, 20);
        add(box);

        JButton button1 = new JButton("Book");
        button1.setFont(new Font("Verdana", Font.PLAIN, 16));
        button1.setBounds(230, 370, 150, 40);
        add(button1);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Ticket Booked");
                setVisible(false);
                new BookTicket();

            }
        });

        setSize(899, 599);
        setSize(900, 600);

    }

    public static void main(String[] args) {
        new BookTicket();
    }

}
