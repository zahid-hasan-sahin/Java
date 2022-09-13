package JavaSwing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo extends JFrame {

    private Container con;
    private JSlider red, green, blue;
    private JLabel label, txt, redTxt, greenTxt, blueTxt;
    private Font f;
    private JTextField redTxtArea, greenTxtArea, blueTxtArea;

    SliderDemo() {
        init();
    }

    void init() {
        con = getContentPane();
        con.setLayout(null);
        f = new Font("Arial", Font.BOLD, 17);

        redTxt = new JLabel("RED      :");
        redTxt.setBounds(20, 30, 80, 30);
        redTxt.setFont(f);
        con.add(redTxt);

        red = new JSlider(0, 255, 0);
        red.setBounds(100, 25, 300, 50);
        con.add(red);

        greenTxt = new JLabel("GREEN :");
        greenTxt.setBounds(20, 100, 80, 30);
        greenTxt.setFont(f);
        con.add(greenTxt);

        green = new JSlider(0, 255, 0);
        green.setBounds(100, 95, 300, 50);
        con.add(green);

        blueTxt = new JLabel("BLUE    :");
        blueTxt.setBounds(20, 170, 80, 30);
        blueTxt.setFont(f);
        con.add(blueTxt);

        blue = new JSlider(0, 255, 0);
        blue.setBounds(100, 165, 300, 50);
        con.add(blue);

        label = new JLabel();
        label.setBounds(450, 30, 300, 300);
        label.setOpaque(true);
        label.setBackground(Color.black);
        con.add(label);

        txt = new JLabel("Preview");
        txt.setBounds(550, 350, 100, 50);
        txt.setFont(f);
        con.add(txt);

        redTxtArea = new JTextField("0");
        redTxtArea.setBounds(100, 250, 80, 40);
        redTxtArea.setFont(f);
        redTxtArea.setHorizontalAlignment(JTextField.CENTER);
        con.add(redTxtArea);

        greenTxtArea = new JTextField("0");
        greenTxtArea.setBounds(200, 250, 80, 40);
        greenTxtArea.setFont(f);
        greenTxtArea.setHorizontalAlignment(JTextField.CENTER);
        con.add(greenTxtArea);

        blueTxtArea = new JTextField("0");
        blueTxtArea.setBounds(300, 250, 80, 40);
        blueTxtArea.setHorizontalAlignment(JTextField.CENTER);
        blueTxtArea.setFont(f);
        con.add(blueTxtArea);

        red.addChangeListener(new Helper());
        green.addChangeListener(new Helper());
        blue.addChangeListener(new Helper());
    }

    class Helper implements ChangeListener {

        @Override
        public void stateChanged(ChangeEvent e) {
            int r = red.getValue();
            int g = green.getValue();
            int b = blue.getValue();
            redTxtArea.setText(String.valueOf(r));
            greenTxtArea.setText(String.valueOf(g));
            blueTxtArea.setText(String.valueOf(b));
            Color c = new Color(r, g, b);
            label.setBackground(c);

        }

    }

    public static void main(String args[]) {
        SliderDemo ob = new SliderDemo();
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setBounds(100, 30, 800, 450);

    }

}
