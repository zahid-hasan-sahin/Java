package JavaSwing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {

    private Container con, con2;
    private JTextField user;
    private JPasswordField pass;
    private JButton login, clear;
    private JLabel userName, password;
    Cursor cur;

    private Font f;

    LoginFrame() {
        con = getContentPane();
        con.setLayout(null);
        init();
    }

    void init() {
        user = new JTextField();
        pass = new JPasswordField();
        login = new JButton("Login");
        clear = new JButton("Clear");
        userName = new JLabel("UserName:");
        password = new JLabel("Password:");
        f = new Font("Arial", Font.BOLD + Font.ITALIC, 15);
        cur = new Cursor(Cursor.HAND_CURSOR);

        userName.setBounds(30, 50, 100, 30);
        userName.setOpaque(true);
        userName.setFont(f);
        con.add(userName);

        password.setBounds(30, 100, 100, 30);
        password.setOpaque(true);
        password.setFont(f);
        con.add(password);

        user.setBounds(120, 50, 200, 30);
        user.setOpaque(true);
        user.setFont(f);
        user.setHorizontalAlignment(JTextField.CENTER);
        con.add(user);

        pass.setBounds(120, 100, 200, 30);
        pass.setOpaque(true);
        pass.setHorizontalAlignment(JTextField.CENTER);
        pass.setEchoChar('*');
        pass.setFont(f);
        con.add(pass);

        login.setBounds(120, 150, 80, 30);
        login.setCursor(cur);
        login.setFont(f);
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (user.getText().equalsIgnoreCase("admin") && pass.getText().equals("12345")) {
                    JOptionPane.showMessageDialog(null, "Login Success");

                    JFrame ob = new JFrame();
                    ob.setVisible(true);
                    ob.setBounds(300, 50, 400, 500);
                    ob.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                } else {
                    JOptionPane.showMessageDialog(null, "Password in incorrect");
                }
            }
        });

        con.add(login);

        clear.setBounds(210, 150, 80, 30);
        clear.setCursor(cur);
        clear.setFont(f);
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                user.setText("");
                pass.setText("");

            }
        });
        con.add(clear);

    }

    public static void main(String args[]) {
        LoginFrame ob = new LoginFrame();
        ob.setVisible(true);
        ob.setBounds(100, 50, 400, 500);
        ob.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

}
