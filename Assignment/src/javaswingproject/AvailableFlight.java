package javaswingproject;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AvailableFlight extends JFrame {

    AvailableFlight() {
        setTitle("Flight");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        setContentPane(new JLabel(new ImageIcon("C:\\Users\\Zahid\\Desktop\\bg.jpg")));

        JButton button1 = new JButton("Book A Ticket");
        button1.setFont(new Font("Verdana", Font.PLAIN, 16));
        button1.setBounds(70, 100, 150, 40);
        add(button1);
        
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new BookTicket();

            }
        });

        JButton button2 = new JButton("View Ticket");
        button2.setFont(new Font("Verdana", Font.PLAIN, 16));
        button2.setBounds(70, 170, 150, 40);
        add(button2);

        JButton button3 = new JButton("Logout");
        button3.setFont(new Font("Verdana", Font.PLAIN, 16));
        button3.setBounds(70, 240, 150, 40);
        add(button3);

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new FlightBook();

            }
        });

        JSeparator s = new JSeparator();
        s.setOrientation(SwingConstants.VERTICAL);
        s.setBounds(300, 20, 10, 500);
        add(s);

        JLabel label1 = new JLabel("Available Flights->");
        label1.setFont(new Font("Verdana", Font.PLAIN, 16));
        label1.setBounds(350, 100, 150, 40);
        add(label1);

        String ticket = "   From           To     Date       Price\n"
                + "   **********************************\n"
                + "   Bangladesh  USA  10-09-22  4000$\n"
                + "   Bangladesh  USA  10-09-22  4000$\n"
                + "   Bangladesh  USA  10-09-22  4000$\n"
                + "   Bangladesh  USA  10-09-22  4000$\n"
                + "   Bangladesh  USA  10-09-22  4000$\n"
                + "   Bangladesh  USA  10-09-22  4000$\n"
                + "   Bangladesh  USA  10-09-22  4000$\n"
                + "   Bangladesh  USA  10-09-22  4000$\n"
                + "   Bangladesh  USA  10-09-22  4000$\n";

        JTextArea textarea1 = new JTextArea(ticket);
        textarea1.setEditable(false);
        textarea1.setFont(new Font("Verdana", Font.PLAIN, 16));
        textarea1.setBounds(400, 150, 400, 350);
        add(textarea1);

        setSize(899, 599);
        setSize(900, 600);
    }

    public static void main(String[] args) {
        new AvailableFlight();
    }

}
