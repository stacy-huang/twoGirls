/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class DiagnosJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public DiagnosJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 110, 120));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 140, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Disease", "Medicine"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 340, 100));

        jLabel1.setText("First Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel2.setText("Last Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 150, -1));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 190, -1));

        jLabel4.setText("ID:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 20, -1));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 150, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Allergy", "Medicine"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 340, 100));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 360, 10));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, 450));

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 570, 10));

        jLabel3.setText("Photo");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 190, 170));

        jLabel5.setText("Syptoms:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        jCheckBox1.setText("Cough");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        jCheckBox2.setText("Headache");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        jCheckBox3.setText("Fever");
        add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        jCheckBox4.setText("Diarrhea");
        add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        jCheckBox5.setText("sore throat");
        add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        jLabel7.setText("Complaint:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 320, 70));

        jLabel8.setText("Diagnos:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, -1));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 130, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 150, -1));

        jLabel9.setText("Medicine:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 150, -1));

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 370, 30));

        jButton2.setText("Submit To Pharmacy");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 160, 60));

        jButton1.setText("Submit To Quarantin");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 160, 50));

        jLabel10.setText("Other:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, -1, -1));

        jCheckBox6.setText("Running Nose");
        add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, -1));

        jCheckBox7.setText("Breath Difficult");
        add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, -1, -1));

        jLabel11.setText("Note: Syptoms Paste to complaint ONLY parse complaint value");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 380, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Prescriptions"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 190, 130));

        jLabel12.setText("medicine combox will display in prescription table in a form of array");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 420, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
