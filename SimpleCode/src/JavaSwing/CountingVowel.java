package JavaSwing;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class CountingVowel extends JFrame {

    private Container con;

    private JLabel msg, aCount, eCount, iCount, oCount, uCount;
    private JTextArea txt;
    private Font f;
    private int[] counter;
    String store;

    CountingVowel() {
        store = "";
        counter = new int[156];
        init();
    }

    void init() {
        con = getContentPane();
        con.setLayout(null);
        msg = new JLabel("Enter: ");
        aCount = new JLabel("a = 0");
        eCount = new JLabel("e = 0");
        iCount = new JLabel("i = 0");
        oCount = new JLabel("o = 0");
        uCount = new JLabel("u = 0");
        txt = new JTextArea();
        f = new Font("Arial", Font.BOLD, 19);

        msg.setBounds(20, 20, 100, 40);
        msg.setFont(f);
        con.add(msg);

        txt.setBounds(120, 20, 300, 80);
        txt.setFont(f);
        txt.setLineWrap(true);
        txt.setWrapStyleWord(true);
        con.add(txt);

        aCount.setBounds(120, 120, 100, 50);
        aCount.setFont(f);
        con.add(aCount);

        eCount.setBounds(120, 170, 100, 50);
        eCount.setFont(f);
        con.add(eCount);

        iCount.setBounds(120, 220, 100, 50);
        iCount.setFont(f);
        con.add(iCount);

        oCount.setBounds(120, 270, 100, 50);
        oCount.setFont(f);
        con.add(oCount);

        uCount.setBounds(120, 320, 100, 50);
        uCount.setFont(f);
        con.add(uCount);

        txt.addKeyListener(new Helper());

    }

    class Helper implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            ++counter[e.getKeyChar()];
            if (e.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                if (store.length() == 0) {
                    return;
                }
                char k = store.charAt(store.length() - 1);
                --counter[k];
            }
            aCount.setText("a = " + (counter['a'] + counter['A']));
            eCount.setText("e = " + (counter['e'] + counter['E']));
            iCount.setText("i = " + (counter['i'] + counter['I']));
            oCount.setText("o = " + (counter['o'] + counter['O']));
            uCount.setText("u = " + (counter['u'] + counter['U']));
            store = txt.getText();

        }

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }

    }

    public static void main(String args[]) {
        CountingVowel ob = new CountingVowel();
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setBounds(100, 50, 500, 600);
    }
}
