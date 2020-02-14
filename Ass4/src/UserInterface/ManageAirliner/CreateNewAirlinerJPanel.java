/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliner;

import Business.AirlinerDirectory;
import Business.User.Airliner;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class CreateNewAirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewAirlinerJPanel
     */
    private JPanel rightPanel;
    //private String newAirliner;
    private Airliner airliner;
    private AirlinerDirectory airlinerDir;
    
    CreateNewAirlinerJPanel(JPanel rightPanel, AirlinerDirectory airlinerDir) {
        //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.rightPanel=rightPanel;
        //this.newAirliner=newAirliner;
        //this.airliner=airliner;
        this.airlinerDir=airlinerDir;
        System.out.println("cons:"+airlinerDir.getAirlinerlist());
//        if(!airliner.toString().equals("null")){
//            txtName.setText(airliner.toString());
//            txtName.setEditable(false);
//        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtNation = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();

        jLabel1.setText("Name");

        jLabel2.setText("Nationality");

        jLabel3.setText("Address");

        jLabel4.setText("Age");

        jLabel5.setText("Phone");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btncancel.setText("caneal");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreate)
                .addGap(116, 116, 116))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(txtNation)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(115, 115, 115)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAge)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnBack)))
                .addGap(401, 401, 401))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))
                        .addGap(68, 68, 68))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btncancel))
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        System.out.println("back:"+airlinerDir.getAirlinerlist());
        rightPanel.remove(this);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        Component comps[] = this.rightPanel.getComponents();
        for(Component comp: comps){
            if(comp instanceof ManageAirlinersJPanel){
                ManageAirlinersJPanel toAirlinerTable = (ManageAirlinersJPanel) comp;
                toAirlinerTable.populateTable(airlinerDir);
            }
        }
        
        layout.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String a_Name=txtName.getText();
        String a_Phone=txtPhone.getText();
        String a_Address=txtAddress.getText();
        String a_Age=txtAge.getText();
        String a_Nation=txtNation.getText();
        //verify input
        if(a_Name.equals("")){
            JOptionPane.showMessageDialog(null, "please enter airliner name");
            txtName.setText("");
            return;
        }
        if(a_Phone.equals("")){
            JOptionPane.showMessageDialog(null, "please enter phone number");
            txtPhone.setText("");
            return;
        }
        if(a_Address.equals("")){
            JOptionPane.showMessageDialog(null, "please enter address");
            txtAddress.setText("");
            return;
        }
        if(a_Nation.equals("")){
            JOptionPane.showMessageDialog(null, "please enter nation");
            txtNation.setText("");
            return;
        }
        try{
            Integer.parseInt(a_Age);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "please enter age in integer");
            txtAge.setText("");
            return;
        }
        
        //create
        System.out.println("create airliner:"+a_Name+a_Age+a_Nation+a_Phone);
        //airlinerDir = new AirlinerDirectory();
        airliner = new Airliner(a_Name,a_Nation,Integer.parseInt(a_Age),a_Address,a_Phone);
        airlinerDir.getAirlinerlist().add(airliner);
        JOptionPane.showMessageDialog(null, "create successfully.");
        txtName.setText("");
        txtAddress.setText("");
        txtNation.setText("");
        txtPhone.setText("");
        txtAge.setText("");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "canceal creation.");

        txtName.setText("");
        txtAddress.setText("");
        txtNation.setText("");
        txtPhone.setText("");
        txtAge.setText("");
    }//GEN-LAST:event_btncancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btncancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNation;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
