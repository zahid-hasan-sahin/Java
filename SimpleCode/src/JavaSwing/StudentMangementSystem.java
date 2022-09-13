package JavaSwing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class StudentMangementSystem extends JFrame {

    private Container con;
    private JLabel fNameLabel, lNameLabel, phoneLabel, cgpaLabel;
    private JTextField fNameField, lNameField, phoneField, cgpaField;
    private JButton add, delete, update, clear;
    private JTable table;
    private JScrollPane scroll;
    DefaultTableModel model;
    String[] col = {"First Name", "Last Name", "phone Number", "CGPA"};
    String[] row = new String[4];

    StudentMangementSystem() {
        init();
    }

    void init() {

        con = getContentPane();
        con.setLayout(null);

        fNameLabel = new JLabel("First Name          : ");
        fNameLabel.setBounds(20, 30, 100, 30);
        con.add(fNameLabel);

        fNameField = new JTextField();
        fNameField.setBounds(150, 30, 150, 30);
        con.add(fNameField);

        lNameLabel = new JLabel("Last Name          : ");
        lNameLabel.setBounds(20, 70, 100, 30);
        con.add(lNameLabel);

        lNameField = new JTextField();
        lNameField.setBounds(150, 70, 150, 30);
        con.add(lNameField);

        phoneLabel = new JLabel("Phone Number  : ");
        phoneLabel.setBounds(20, 110, 100, 30);
        con.add(phoneLabel);

        phoneField = new JTextField();
        phoneField.setBounds(150, 110, 150, 30);
        con.add(phoneField);

        cgpaLabel = new JLabel("CGPA                   : ");
        cgpaLabel.setBounds(20, 150, 100, 30);
        con.add(cgpaLabel);

        cgpaField = new JTextField();
        cgpaField.setBounds(150, 150, 150, 30);
        con.add(cgpaField);

        add = new JButton("ADD");
        add.setBounds(350, 30, 90, 30);
        con.add(add);

        delete = new JButton("DELETE");
        delete.setBounds(350, 70, 90, 30);
        con.add(delete);

        update = new JButton("UPDATE");
        update.setBounds(350, 110, 90, 30);
        con.add(update);

        clear = new JButton("CLEAR");
        clear.setBounds(350, 150, 90, 30);
        con.add(clear);

        model = new DefaultTableModel();
        model.setColumnIdentifiers(col);
        table = new JTable(model);
        table.setSelectionBackground(Color.lightGray);
        table.setBackground(Color.WHITE);

        scroll = new JScrollPane(table);
        scroll.setBounds(30, 250, 400, 300);
        con.add(scroll);

        Helper ob = new Helper();
        add.addActionListener(ob);
        clear.addActionListener(ob);
        update.addActionListener(ob);
        delete.addActionListener(ob);

        table.addMouseListener(new Help());

    }

    class Help implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent arg0) {
            int index = table.getSelectedRow();
            fNameField.setText(model.getValueAt(index, 0).toString());
            lNameField.setText(model.getValueAt(index, 1).toString());
            phoneField.setText(model.getValueAt(index, 2).toString());
            cgpaField.setText(model.getValueAt(index, 3).toString());

        }

        @Override
        public void mousePressed(MouseEvent arg0) {
        }

        @Override
        public void mouseReleased(MouseEvent arg0) {
        }

        @Override
        public void mouseEntered(MouseEvent arg0) {
        }

        @Override
        public void mouseExited(MouseEvent arg0) {
        }

    }

    class Helper implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == add) {
                row[0] = fNameField.getText();
                row[1] = lNameField.getText();
                row[2] = phoneField.getText();
                row[3] = cgpaField.getText();
                model.addRow(row);

            }
            if (e.getSource() == clear) {
                fNameField.setText("");
                lNameField.setText("");
                phoneField.setText("");
                cgpaField.setText("");
            }
            if (e.getSource() == delete) {

                int c = table.getSelectedRow();
                if (c < 0) {
                    JOptionPane.showMessageDialog(null, "No row Selected");
                } else {
                    model.removeRow(c);
                }

            }
            if (e.getSource() == update) {
                int c = table.getSelectedRow();
                row[0] = fNameField.getText();
                row[1] = lNameField.getText();
                row[2] = phoneField.getText();
                row[3] = cgpaField.getText();
                model.setValueAt(row[0], c, 0);
                model.setValueAt(row[1], c, 1);
                model.setValueAt(row[2], c, 2);
                model.setValueAt(row[3], c, 3);
            }
        }

    }

    public static void main(String args[]) {
        StudentMangementSystem ob = new StudentMangementSystem();
        ob.setVisible(true);
        ob.setBounds(100, 50, 550, 650);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
