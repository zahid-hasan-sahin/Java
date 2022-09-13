package javaswingproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlightBook extends JFrame {
    
    public FlightBook() {
        
        setTitle("Flight");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        setContentPane(new JLabel(new ImageIcon("C:\\Users\\Zahid\\Desktop\\bg.jpg")));
        
        JLabel label1 = new JLabel("Login");
        label1.setFont(new Font("Verdana", Font.PLAIN, 20));
        label1.setBounds(200, 0, 200, 200);
        add(label1);
        
        JLabel label2 = new JLabel("Username: ");
        label2.setFont(new Font("Verdana", Font.PLAIN, 16));
        label2.setBounds(25, 170, 200, 30);
        add(label2);
        
        JTextField textfield1 = new JTextField();
        textfield1.setFont(new Font("Verdana", Font.PLAIN, 16));
        textfield1.setBounds(150, 170, 200, 30);
        add(textfield1);
        
        JLabel label3 = new JLabel("Password: ");
        label3.setFont(new Font("Verdana", Font.PLAIN, 16));
        label3.setBounds(25, 250, 200, 30);
        add(label3);
        
        JPasswordField password1 = new JPasswordField();
        password1.setFont(new Font("Verdana", Font.PLAIN, 16));
        password1.setBounds(150, 250, 200, 30);
        add(password1);
        
        JButton button1 = new JButton("Login");
        button1.setFont(new Font("Verdana", Font.PLAIN, 16));
        button1.setBounds(170, 320, 150, 30);
        add(button1);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (textfield1.getText().equalsIgnoreCase("admin") && password1.getText().equals("admin")) {
                    setVisible(false);
                    new AvailableFlight();
                } else {
                    JOptionPane.showMessageDialog(null, "username or password is incorrect");
                }
            }
        });
        
        JButton button2 = new JButton("SingUp");
        button2.setFont(new Font("Verdana", Font.PLAIN, 16));
        button2.setBounds(500, 230, 150, 30);
        add(button2);
        
        setSize(899, 599);
        setSize(900, 600);
    }
    
    public static void main(String args[]) {
        new FlightBook();
    }
}
