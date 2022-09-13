package JavaSwing;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuItemDemo extends JFrame {

    private JMenuBar bar; 
    private JMenu file, edit, view;
    private JMenuItem newMenu, copy, cut;

    MenuItemDemo() {
        init();
    }

    void init() {
        bar = new JMenuBar();

        this.setJMenuBar(bar);

        file = new JMenu("File");
        bar.add(file);

        edit = new JMenu("EDit");
        bar.add(edit);

        view = new JMenu("View");
        bar.add(view);

        newMenu = new JMenuItem("New");
        file.add(newMenu);

        copy = new JMenuItem("Copy");
        edit.add(copy);

        cut = new JMenuItem("Cut");
        edit.add(cut);
        
        

    }

    public static void main(String args[]) {
        MenuItemDemo ob = new MenuItemDemo();
        ob.setVisible(true);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setBounds(100, 30, 500, 600);
    }
}
