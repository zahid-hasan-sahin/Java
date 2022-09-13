package prelimlabexercise5.pkg2;

import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14));
        jLabel1.setText("First Name       :");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14));
        jLabel2.setText("Middle Name   :");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14));
        jLabel3.setText("Last Name        :");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14));
        jLabel4.setText("Classification   :");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14));
        jLabel5.setText("Status               :");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 14));
        jLabel6.setText("Subjects            :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Resident ", "Non-Resident"}));

        jRadioButton1.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 13));
        jRadioButton1.setText("Regular");

        jRadioButton2.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 13));
        jRadioButton2.setText("Irregular ");

        jCheckBox1.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 13));
        jCheckBox1.setText("CCS103 Computer Programming 2");

        jCheckBox2.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 0, 13));
        jCheckBox2.setText("CCS104 Discrete Structures 1");

        jCheckBox3.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox3.setFont(new java.awt.Font("Segoe UI", 0, 13));
        jCheckBox3.setText("CCS105 Human Computer Interaction 1");

        jCheckBox4.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox4.setFont(new java.awt.Font("Segoe UI", 0, 13));
        jCheckBox4.setText("CCS106 Social and Professional Issues");

        jCheckBox5.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox5.setFont(new java.awt.Font("Segoe UI", 0, 13));
        jCheckBox5.setText("COM101 Purposive Communication");

        jCheckBox6.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox6.setFont(new java.awt.Font("Segoe UI", 0, 13));
        jCheckBox6.setText("GAD101 Gender and Development");

        jCheckBox7.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox7.setFont(new java.awt.Font("Segoe UI", 0, 13));
        jCheckBox7.setText("NSTP2 National Service Training Program 2");

        jCheckBox8.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox8.setFont(new java.awt.Font("Segoe UI", 0, 13));
        jCheckBox8.setText("PED102 Physical Education 2 ");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("\t\t\tDetails\n--------------------------------------------------------****************---------------------------------------------------");
        jTextArea1.setToolTipText("");
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton1)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel6))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(38, 38, 38)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jRadioButton1)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jRadioButton2))
                                                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jCheckBox1)
                                                                        .addComponent(jCheckBox2)
                                                                        .addComponent(jCheckBox3)
                                                                        .addComponent(jCheckBox5)
                                                                        .addComponent(jCheckBox4)
                                                                        .addComponent(jCheckBox8)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(116, 116, 116)
                                                                                .addComponent(jButton2))
                                                                        .addComponent(jCheckBox7)
                                                                        .addComponent(jCheckBox6))))))
                                .addGap(63, 63, 63)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(25, 25, 25)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jRadioButton1)
                                                        .addComponent(jRadioButton2))
                                                .addGap(28, 28, 28)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jCheckBox1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jCheckBox2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jCheckBox3)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jCheckBox4)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jCheckBox5)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox8)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jComboBox1.setSelectedIndex(0);
        buttonGroup1.clearSelection();
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox8.setSelected(false);

    }

    static boolean isValidName(String s) {
        boolean ch = false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                ch = true;
            }
        }
        return ch;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        boolean isCom = true;
        int miscellaneousFee = 0;
        int tuitionFee = 0;
        String classification = "";
        String status = "";
        int count = 0;
        boolean isRes = false;
        String sub = "";

        String fName = jTextField1.getText();
        String mName = jTextField2.getText();
        String lName = jTextField3.getText();
        if (!isValidName(fName) || !isValidName(mName) || !isValidName(lName)) {
            isCom = false;
        }

        if (jComboBox1.getSelectedIndex() == 0) {
            classification = "Resident";
            isRes = true;
            miscellaneousFee = 1000;
        } else if (jComboBox1.getSelectedIndex() == 1) {
            classification = "Non-Resident ";
            miscellaneousFee = 3000;
        } else {

            isCom = false;
        }

        if (jRadioButton1.isSelected()) {
            status = "Regular";
        } else if (jRadioButton2.isSelected()) {
            status = "Irregular";
        } else {
            isCom = false;
        }

        if (isRes) {
            if (jCheckBox1.isSelected()) {
                tuitionFee += 100 * 3;
                tuitionFee += 500;
                ++count;
                sub = sub + "CCS103 Computer Programming 2 (3 units, Lab)\n";
            }
            if (jCheckBox2.isSelected()) {
                tuitionFee += 100 * 3;
                tuitionFee += 500;
                ++count;
                if (count == 1) {
                    sub = sub + "CCS104 Discrete Structures 1 (3 units, Lab)\n";
                } else {
                    sub = sub + "                                         CCS104 Discrete Structures 1 (3 units, Lab)\n";
                }
            }
            if (jCheckBox3.isSelected()) {
                tuitionFee += 100 * 3;
                tuitionFee += 500;
                ++count;
                if (count == 1) {
                    sub = sub + "CCS105 Human Computer Interaction 1 (3 units, Lab)\n";
                } else {
                    sub = sub + "                                         CCS105 Human Computer Interaction 1 (3 units, Lab)\n";
                }
            }
            if (jCheckBox4.isSelected()) {
                tuitionFee += 100 * 3;
                ++count;
                if (count == 1) {
                    sub = sub + "CCS106 Social and Professional Issues (3 units, Lec)\n";
                } else {
                    sub = sub + "                                           CCS106 Social and Professional Issues (3 units, Lec)\n";

                }
            }
            if (jCheckBox5.isSelected()) {
                tuitionFee += 100 * 3;
                ++count;
                if (count == 1) {
                    sub = sub + "COM101 Purposive Communication (3 units, Lec)\n";
                } else {
                    sub = sub + "                                         COM101 Purposive Communication (3 units, Lec)\n";

                }
            }
            if (jCheckBox6.isSelected()) {
                tuitionFee += 100 * 3;
                ++count;
                if (count == 1) {
                    sub = sub + "GAD101 Gender and Development (3 units, Lec)\n";
                } else {
                    sub = sub + "                                          GAD101 Gender and Development (3 units, Lec)\n";
                }
            }
            if (jCheckBox7.isSelected()) {
                tuitionFee += 100 * 3;
                ++count;
                if (count == 1) {
                    sub = sub + "NSTP2 National Service Training Program 2 (3 units, Lec)\n";
                } else {
                    sub = sub + "                                           NSTP2 National Service Training Program 2 (3 units, Lec)\n";

                }
            }
            if (jCheckBox8.isSelected()) {
                tuitionFee += 100 * 3;
                ++count;
                if (count == 1) {
                    sub = sub + "PED102 Physical Education 2 (3 units, Lec)\n";
                } else {
                    sub = sub + "                                         PED102 Physical Education 2 (3 units, Lec)\n";
                }
            }

            if (status.equals("Regular")) {
                if (count < 8) {
                    JOptionPane.showMessageDialog(null, "A Regular enrollee is required to enroll all the listed subjects", "Erorr", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            if (status.equals("Irregular")) {
                if (count < 2) {
                    JOptionPane.showMessageDialog(null, "A Irregular enrollee is required to enroll at least Two subjects", "Erorr", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        } else {

            if (jCheckBox1.isSelected()) {
                tuitionFee += 300 * 3;
                tuitionFee += 1000;
                ++count;
                sub = sub + "CCS103 Computer Programming 2 (3 units, Lab)\n";
            }
            if (jCheckBox2.isSelected()) {
                tuitionFee += 300 * 3;
                tuitionFee += 1000;
                ++count;
                if (count == 1) {
                    sub = sub + "CCS104 Discrete Structures 1 (3 units, Lab)\n";
                } else {
                    sub = sub + "                                         CCS104 Discrete Structures 1 (3 units, Lab)\n";
                }
            }
            if (jCheckBox3.isSelected()) {
                tuitionFee += 300 * 3;
                tuitionFee += 1000;
                ++count;
                if (count == 1) {
                    sub = sub + "CCS105 Human Computer Interaction 1 (3 units, Lab)\n";
                } else {
                    sub = sub + "                                         CCS105 Human Computer Interaction 1 (3 units, Lab)\n";
                }
            }
            if (jCheckBox4.isSelected()) {
                tuitionFee += 300 * 3;
                ++count;
                if (count == 1) {
                    sub = sub + "CCS106 Social and Professional Issues (3 units, Lec)\n";
                } else {
                    sub = sub + "                                           CCS106 Social and Professional Issues (3 units, Lec)\n";

                }
            }
            if (jCheckBox5.isSelected()) {
                tuitionFee += 300 * 3;
                ++count;
                if (count == 1) {
                    sub = sub + "COM101 Purposive Communication (3 units, Lec)\n";
                } else {
                    sub = sub + "                                         COM101 Purposive Communication (3 units, Lec)\n";

                }
            }
            if (jCheckBox6.isSelected()) {
                tuitionFee += 300 * 3;
                ++count;
                if (count == 1) {
                    sub = sub + "GAD101 Gender and Development (3 units, Lec)\n";
                } else {
                    sub = sub + "                                          GAD101 Gender and Development (3 units, Lec)\n";
                }
            }
            if (jCheckBox7.isSelected()) {
                tuitionFee += 300 * 3;
                ++count;
                if (count == 1) {
                    sub = sub + "NSTP2 National Service Training Program 2 (3 units, Lec)\n";
                } else {
                    sub = sub + "                                           NSTP2 National Service Training Program 2 (3 units, Lec)\n";

                }
            }
            if (jCheckBox8.isSelected()) {
                tuitionFee += 300 * 3;
                ++count;
                if (count == 1) {
                    sub = sub + "PED102 Physical Education 2 (3 units, Lec)\n";
                } else {
                    sub = sub + "                                         PED102 Physical Education 2 (3 units, Lec)\n";
                }
            }

            if (status.equals("Regular")) {
                if (count < 8) {
                    JOptionPane.showMessageDialog(null, "A Regular enrollee is required to enroll all the listed subjects", "Erorr", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            if (status.equals("Irregular")) {
                if (count < 2) {
                    JOptionPane.showMessageDialog(null, "A Irregular enrollee is required to enroll at least Two subjects", "Erorr", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        }
        if (isCom) {

            String res = " \n"
                    + "   Frist Name                 : " + fName + "\n"
                    + "   Midle Name               : " + mName + "\n"
                    + "   Last Name                 : " + lName + "\n"
                    + "   Classification            : " + classification + "\n"
                    + "   status                          : " + status + "\n"
                    + "   miscellaneous fee    : " + miscellaneousFee + "\n"
                    + "   tuition fee                   : " + tuitionFee + "\n"
                    + "   total fee                       : " + (miscellaneousFee + tuitionFee) + "\n"
                    + "   List Of Subjects         :" + sub + ""
                    + "******************************************************************************************";
            jTextArea1.append(res);
        } else {
            JOptionPane.showMessageDialog(null, "Incomplete Information", "Erorr", JOptionPane.ERROR_MESSAGE);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;

}
