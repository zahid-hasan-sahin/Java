package JavaSwing;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class showmsgDialogue {

    public static void main(String[] args) {
        int n = JOptionPane.showConfirmDialog(null, "Do you want to exist?", "title bar", JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println(n);
      
    }
}
