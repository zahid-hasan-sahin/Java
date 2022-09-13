package javaswing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class Projrct extends JFrame {

    private Container body;
    private JLabel label;
    private JTextField tfield;
    private JButton button1, button2;
    private JTextArea tarea;
    private ImageIcon icon;
    private Font font;

    Projrct() {
        call();
    }

    public void call() {
        body = this.getContentPane();
        body.setLayout(null);
        body.setBackground(Color.pink);

        icon = new ImageIcon(getClass().getResource("image.jpg"));
        label = new JLabel(icon);
        label.setBounds(20, 20, 450, 200);
        body.add(label);
        font = new Font("arial", Font.BOLD, 20);

        tfield = new JTextField();
        tfield.setBounds(300, 240, 130, 50);
        tfield.setFont(font);
        body.add(tfield);

        button1 = new JButton("Multi");
        button1.setBounds(270, 300, 100, 40);
        button1.setFont(font);
        body.add(button1);

        button2 = new JButton("Clear");
        button2.setBounds(380, 300, 100, 40);
        button2.setFont(font);
        body.add(button2);

        tarea = new JTextArea();
        tarea.setFont(font);
        tarea.setBounds(20, 360, 400, 340);
        body.add(tarea);
        
        button2.addActionListener (new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                tfield.setText("");
                tarea.setText("");
                
            }
            
        });
        
        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String t =(tfield.getText());
                int n = Integer.valueOf(t);
                for (int i = 1; i <=10; i++) {
                    int r = n * i;
                    String a= String.valueOf(n);
                    String b = String.valueOf(i);
                    String c = String.valueOf(r);
                    tarea.append(a+" x "+b+ " = "+c+"\n");
                    
                }
                
            }
        });

    }

    public static void main(String[] agrs) {
        Projrct frame = new Projrct();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Multificationn Table");
        frame.setBounds(280, 2, 500, 750);

    }

}
