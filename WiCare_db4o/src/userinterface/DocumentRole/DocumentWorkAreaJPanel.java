/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DocumentRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AdminOrganization;
import Business.Organization.DocumentOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author stacyhuang
 */
public class DocumentWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DocumentWorkAreaJPanel
     */
    private JPanel jpanel;
    private UserAccount userAccount;
    private DocumentOrganization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    private Network network;
    public DocumentWorkAreaJPanel(JPanel jpanel, UserAccount userAccount, DocumentOrganization organization, Enterprise enterprise, EcoSystem system, Network network) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.jpanel=jpanel;
        this.userAccount=userAccount;
        this.organization=organization;
        this.enterprise=enterprise;
        this.system=system;
        this.network=network;
          managePatientbtn.setOpaque(false);
managePatientbtn.setBorderPainted(false);
managePatientbtn.setContentAreaFilled(false);

sendRecordbtn.setOpaque(false);
sendRecordbtn.setBorderPainted(false);
sendRecordbtn.setContentAreaFilled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        managePatientbtn = new javax.swing.JButton();
        sendRecordbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        managePatientbtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        managePatientbtn.setForeground(new java.awt.Color(255, 153, 51));
        managePatientbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/medical-report.png"))); // NOI18N
        managePatientbtn.setText("Manage Patients");
        managePatientbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePatientbtnActionPerformed(evt);
            }
        });

        sendRecordbtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sendRecordbtn.setForeground(new java.awt.Color(255, 153, 51));
        sendRecordbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/patient.png"))); // NOI18N
        sendRecordbtn.setText("Send Patient Record To Doctor");
        sendRecordbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendRecordbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(managePatientbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(sendRecordbtn)
                .addContainerGap(272, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(managePatientbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendRecordbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void managePatientbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePatientbtnActionPerformed
        // TODO add your handling code here:
       CardLayout layout=(CardLayout)jpanel.getLayout();
       jpanel.add("manage patient",new ManagePatientJPanel(jpanel,enterprise,system));
       layout.next(jpanel);
    }//GEN-LAST:event_managePatientbtnActionPerformed

    private void sendRecordbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendRecordbtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout=(CardLayout)jpanel.getLayout();
       jpanel.add("send patient to doctor",new SendPatientJPanel(jpanel,userAccount,organization,enterprise,system));
       layout.next(jpanel);
    }//GEN-LAST:event_sendRecordbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton managePatientbtn;
    private javax.swing.JButton sendRecordbtn;
    // End of variables declaration//GEN-END:variables
}
