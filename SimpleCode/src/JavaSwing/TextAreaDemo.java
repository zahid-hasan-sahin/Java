package JavaSwing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextAreaDemo extends JFrame {

    private Container con;
    private JTextArea txt;
    private Font f;
    private JScrollPane s;

    TextAreaDemo() {
        init();
    }

    void init() {
        con = getContentPane();
        f = new Font("Arial", Font.BOLD, 18);

        con.setLayout(null);
        txt = new JTextArea();
        txt.setFont(f);
        txt.setLineWrap(true);
        txt.setWrapStyleWord(true);

        s = new JScrollPane(txt, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
     
        con.add(s);
        s.setBounds(50, 80, 400, 250);
        
        
        

    }

    public static void main(String args[]) {
        TextAreaDemo ob = new TextAreaDemo();
        ob.setVisible(true);
        ob.setBounds(50, 80, 500, 600);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
