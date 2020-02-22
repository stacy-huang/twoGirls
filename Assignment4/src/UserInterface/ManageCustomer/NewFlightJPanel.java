/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomer;

import Business.Flight;
import Business.FlightDirectory;
import UserInterface.ManageFlight.ManageAirlinerFlightScheduleJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class NewFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewFlightJPanel
     */

    private JPanel rightPanel;
    private FlightDirectory flightDirectory;
    private String airlinerName;
    private String frommin_str;
    private String fromhour_str;
      private String tomin_str;
    private String tohour_str;
    public NewFlightJPanel(JPanel rightPanel, FlightDirectory flightDirectory,String airlinerName) {
        //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.rightPanel=rightPanel;
        this.flightDirectory=flightDirectory;
         this.airlinerName=airlinerName;
        for(int i=0; i<2; i++){
            for(int j=0; j<10; j++){
                fromhour.addItem(i+""+j);
            }
            fromhour.addItem("20");fromhour.addItem("21");fromhour.addItem("22");fromhour.addItem("23");
            fromhour.setSelectedItem(-1);
        }
        for(int k=0; k<6; k++){
            for(int a=0; a<10; a++){
                frommin.addItem(k+""+a);
                frommin.setSelectedItem(-1);
            }
        }
        
        for(int i=0; i<2; i++){
            for(int j=0; j<10; j++){
                tohour.addItem(i+""+j);
            }
            tohour.addItem("20");tohour.addItem("21");tohour.addItem("22");tohour.addItem("23");
            tohour.setSelectedItem(-1);
        }
        for(int k=0; k<6; k++){
            for(int a=0; a<10; a++){
                tomin.addItem(k+""+a);
                tomin.setSelectedItem(-1);
            }
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDepart = new javax.swing.JTextField();
        txtDestination = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtFlightNum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fromhour = new javax.swing.JComboBox<>();
        frommin = new javax.swing.JComboBox<>();
        tohour = new javax.swing.JComboBox<>();
        tomin = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        estimationtxt = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel2.setText("Departure:");

        jLabel3.setText("Destination:");

        jLabel4.setText("Depart Time:");

        jLabel5.setText("Depart Date:");

        txtDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartActionPerformed(evt);
            }
        });

        txtDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDestinationActionPerformed(evt);
            }
        });

        jLabel1.setText("Flight Number: ");

        jLabel6.setText("Arrive Time:");

        jLabel7.setText("Arrive Date:");

        fromhour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromhourActionPerformed(evt);
            }
        });

        tohour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tohourActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setText(":");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel9.setText(":");

        jLabel10.setText("Estimation:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDepart)
                            .addComponent(txtDestination)
                            .addComponent(estimationtxt)
                            .addComponent(txtFlightNum)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tohour, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tomin, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(fromhour, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(frommin, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFlightNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fromhour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frommin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(tohour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(tomin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(estimationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnCreate)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(719, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DatePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatePickerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatePickerActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        String estimation = estimationtxt.getText();
        String flightNumber=txtFlightNum.getText();
        String depart=txtDepart.getText();
        String desti=txtDestination.getText();
        fromhour_str=fromhour.getSelectedItem().toString();
        frommin_str=frommin.getSelectedItem().toString();
        tohour_str=tohour.getSelectedItem().toString();
        tomin_str=tomin.getSelectedItem().toString();
        
        if(flightNumber.equals("")){
            JOptionPane.showMessageDialog(null, "please enter flight number");
            txtFlightNum.setText("");
            return;
        }
        else{
            for(Flight f:flightDirectory.getFlightlist()){
            if(f.getFlightnumber().equalsIgnoreCase(flightNumber)){
                JOptionPane.showMessageDialog(null, "there is the same flight number already.");
                txtFlightNum.setText("");
                return;
            }
        }
        }
        if(desti.equals("")){
            JOptionPane.showMessageDialog(null, "please enter destination");
            txtDestination.setText("");
            return;
        }
        if(depart.equals("")){
            JOptionPane.showMessageDialog(null, "please enter depart");
            txtDepart.setText("");
            return;
        }
        //check depart and destination
        if(desti.equals(depart)){
            JOptionPane.showMessageDialog(null, "departure and destination cannot be the same");
            txtDepart.setText("");
            txtDestination.setText("");
            return;
        }
        //chack date validation
        if(jDateChooser1.getDate()==null||jDateChooser2.getDate()==null){
            JOptionPane.showMessageDialog(null, "must choose date");
            return;
        }
        if(jDateChooser1.getDate().compareTo(jDateChooser2.getDate())>0){
            JOptionPane.showMessageDialog(null, "arrival time cannot be later than department time");
            return;
        }
        if(!estimationtxt.equals("")&&!txtFlightNum.equals("")&&!txtDepart.equals("")&&!txtDestination.equals("")&&jDateChooser1.getDate()!=null&&jDateChooser2.getDate()!=null){
        Flight flight = flightDirectory.addflight();
        flight.setAirliner(airlinerName);
        flight.setFromtime(LocalTime.parse(fromhour_str+":"+frommin_str));
        flight.setTotime(LocalTime.parse(tohour_str+":"+tomin_str));
        
        if(estimation.equals("")){
            flight.setEstimation("null");
        }else{
            flight.setEstimation(estimation);
        }
        List<String> list=new ArrayList<String>();
        flight.setAirliner(airlinerName);
        flight.setFlightnumber(flightNumber);
        flight.setFrom(depart);
        flight.setTo(desti);
        flight.setID(list);
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
        flight.setFromdate(formatter.format(jDateChooser1.getDate()));
        System.out.println("get date from create flight:"+jDateChooser1.getDate());
        flight.setTodate(formatter.format(jDateChooser2.getDate()));
        JOptionPane.showMessageDialog(null, "flight create sucessfully.");
            
        }
        
        txtFlightNum.setText("");
        txtDestination.setText("");
        txtDepart.setText("");
        estimationtxt.setText("");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        Component comps[] = this.rightPanel.getComponents();
        for(Component comp: comps){
            if(comp instanceof ManageAirlinerFlightScheduleJPanel){
                ManageAirlinerFlightScheduleJPanel backairliner = (ManageAirlinerFlightScheduleJPanel) comp;
                backairliner.populate();
            }
        }
        
        layout.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartActionPerformed

    private void txtDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDestinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinationActionPerformed

    private void fromhourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromhourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromhourActionPerformed

    private void tohourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tohourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tohourActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JTextField estimationtxt;
    private javax.swing.JComboBox<String> fromhour;
    private javax.swing.JComboBox<String> frommin;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> tohour;
    private javax.swing.JComboBox<String> tomin;
    private javax.swing.JTextField txtDepart;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtFlightNum;
    // End of variables declaration//GEN-END:variables
}
